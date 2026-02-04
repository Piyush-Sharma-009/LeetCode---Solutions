class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        if(arr.size() <3) return false;
        bool inc = false,dec = false;
        for(int i = 0;i<arr.size()-1;i++){
            if(arr[i] == arr[i+1]) return false;
            if(arr[i]< arr[i+1]){
                if(dec == true) return false;
                inc = true;
            }
            if(arr[i] > arr[i+1]){
                if(inc == false) return false;
                dec = true;
            }
        }
        if(inc == true && dec == true) return true;
        return false;
    }
};
