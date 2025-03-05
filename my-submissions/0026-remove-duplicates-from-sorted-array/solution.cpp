class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        int i =0;
        for(int j =1;j<arr.size();j++){
            if(arr[i]!=arr[j]){
                arr[++i] = arr[j];
            }
        }
        return i+1;
    }
};
