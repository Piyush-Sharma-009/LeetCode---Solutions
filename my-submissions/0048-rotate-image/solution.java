class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int row = 0;
        int l = 0;
        int r = n -1;
        while(row<n){
            while(l<r){
                int temp = matrix[row][l];
                matrix[row][l] = matrix[row][r];
                matrix[row][r] = temp;
                l++;
                r--;
            }
            l = 0;
            r = n-1;
            row++;
        }
        return;
    }
}
