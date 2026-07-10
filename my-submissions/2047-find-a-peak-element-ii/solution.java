class Solution {
    static int maxEle(int[][] mat,int mid,int n){
        int maxE = -1;
        int idx = -1;
        for(int i = 0;i<n;i++){
            if(mat[i][mid] > maxE) {
                maxE = mat[i][mid];
                idx = i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m  = mat[0].length;

        int low =0,high  = m -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int row = maxEle(mat,mid,n);
            int left = mid -1 >=0 ? mat[row][mid -1] : -1;
            int right = mid + 1< m ? mat[row][mid + 1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right) return new int[]{row,mid};
            else if(mat[row][mid] <left) high = mid - 1;
            else if(mat[row][mid] < right) low = mid + 1;
        }
        return new int[]{-1,-1};
    }
}
