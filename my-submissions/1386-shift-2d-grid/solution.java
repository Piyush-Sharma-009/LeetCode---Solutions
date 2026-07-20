class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int T = m*n;

        List<List<Integer>> res = new ArrayList<>();

        k = k%T;

        for(int i = 0;i<m;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0;j<n;j++){
                int newflatIdx = i*n + j;
                int orgFlatIdx = (newflatIdx - k + T)%T;
               
                int orgRow = orgFlatIdx/n;
                int orgCol = orgFlatIdx%n;
                row.add(grid[orgRow][orgCol]);
            }
            res.add(row);
        }
        return res;
    }
}
