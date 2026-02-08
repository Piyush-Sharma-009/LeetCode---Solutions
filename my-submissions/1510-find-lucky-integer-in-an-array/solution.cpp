class Solution {
public:
    int findLucky(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        vector<int> res;
        int i = 0;
        while(i <arr.size()-1){
        int cnt = 1;
        int j = i+1;
        while(j<arr.size()){
            if(arr[i] == arr[j]){
                cnt++;
            j++;
            }
            else
            break;
        }
        if(cnt == arr[i])
            res.push_back(arr[i]);
        i =j;
        }
            if(res.size() >0){
                return res[res.size()-1];
            }
            return -1;
        
    }
};
