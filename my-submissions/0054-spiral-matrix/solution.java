class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int left = 0;
        int bottom = row - 1;
        int right = col - 1;
        ArrayList<Integer> li = new ArrayList<>();

        // if(matrix.length == 0 || matrix == null ||  matrix[0].length == 0)return li;

        while(top <= bottom && left <= right){
            for(int i = left ; i<=right;i++){
                li.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;i++){
                li.add(matrix[i][right]);
            }
                right--;
                if(top<=bottom){
            for(int i = right;i>=left;i--){
                li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
            for(int i = bottom;i>=top;i--){
                li.add(matrix[i][left]);
            }
            left++;
            }
        }
        return li;
    }
}
