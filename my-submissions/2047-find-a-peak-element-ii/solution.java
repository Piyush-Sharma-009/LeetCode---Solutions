class Solution {
    static int maxRow(int[][] mat, int col){
        int n = mat.length;
        int maxv = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i<n;i++){
            if(mat[i][col] > maxv){
                maxv = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0, high = m - 1;
        while(low <= high){
            int mid = (low + (high - low)/2);
            int row = maxRow(mat,mid);

            int left;
            if(mid-1 >= 0){
                left = mat[row][mid-1];
            }
            else left = -1;
            int right;
            if(mid+1< m){
                right = mat[row][mid+1];
            }
            else right = -1;

            if(mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row,mid};
            }
            else if(mat[row][mid] < left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{-1,-1};
        
    }
}
