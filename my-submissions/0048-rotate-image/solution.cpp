class Solution {
public:
    void rotate(vector<vector<int>>& arr) {
        int n = arr.size();
        //transpose of matrix
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                swap(arr[i][j],arr[j][i]);
            }
        }
        //swap the columns
        for(int i = 0;i<n;i++){
             reverse(arr[i].begin(),arr[i].end());
        }
    }
};
