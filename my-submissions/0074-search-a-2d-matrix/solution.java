class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        int low = 0, high = row*col - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int currE = matrix[mid/col][mid%col];
            if(currE == target) return true;
            else if(currE > target) high = mid -1;
            else low = mid + 1;
        }
        return false;
    }
}
