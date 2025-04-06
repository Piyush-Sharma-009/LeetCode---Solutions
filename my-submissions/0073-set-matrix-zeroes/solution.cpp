class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        bool isrow0 = false,iscol0 = false;
        int m = matrix.size(),n= matrix[0].size();
        //iterate through 0th row
        for(int j = 0;j<n;j++){
            if(matrix[0][j] == 0)
            isrow0 = true;
        }
        //iterate through 0th column
        for(int i = 0;i<m;i++){
            if(matrix[i][0] == 0)
            iscol0 = true;
        }

        //iterate through matrix from i = 1 to m and j= 1 to n and if element found 0 ,make its corresponding 0th row and 0th column element to 0
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //again iterating from i = 1 to m and j  =1 to n and making the oth row and oth column corresponding rows and columns to 0
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isrow0){
            for(int j = 0;j<n;j++){
                matrix[0][j] = 0;
            }
        }
        if(iscol0){
            for(int i = 0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
};
