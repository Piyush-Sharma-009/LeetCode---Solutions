class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int sr = 0, sc = 0;
        int litterCount = 0;

        // Find starting position and count litter
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                } else if (ch == 'L') {
                    litterCount++;
                }
            }
        }

        if (litterCount == 0) {
            return 0;
        }

        // Assign an ID to each litter
        int[][] id = new int[m][n];
        for (int[] row : id) {
            Arrays.fill(row, -1);
        }

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (classroom[i].charAt(j) == 'L') {
                    id[i][j] = cnt++;
                }
            }
        }

        int totalMask = (1 << litterCount) - 1;

        // visited[row][col][energy][mask]
        boolean[][][][] visited =
            new boolean[m][n][energy + 1][1 << litterCount];

        // {row, col, remainingEnergy, mask, moves}
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sr, sc, energy, 0, 0});
        visited[sr][sc][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int e = curr[2];
            int mask = curr[3];
            int moves = curr[4];

            if (mask == totalMask) {
                return moves;
            }

            if (e == 0) {
                continue;
            }

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                char cell = classroom[nr].charAt(nc);

                if (cell == 'X') {
                    continue;
                }

                int newEnergy = e - 1;
                int newMask = mask;

                // Collect litter
                if (cell == 'L') {
                    newMask |= (1 << id[nr][nc]);
                }

                // Reset energy
                if (cell == 'R') {
                    newEnergy = energy;
                }

                if (!visited[nr][nc][newEnergy][newMask]) {
                    visited[nr][nc][newEnergy][newMask] = true;

                    q.offer(new int[]{
                        nr,
                        nc,
                        newEnergy,
                        newMask,
                        moves + 1
                    });
                }
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
