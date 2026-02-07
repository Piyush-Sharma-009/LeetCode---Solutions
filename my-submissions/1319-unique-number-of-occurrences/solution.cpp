class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        vector<int> res;
        for(int i = 0;i<arr.size();i++){
            int cnt = 1;
            while(i+1 <arr.size() && arr[i] == arr[i+1]){
                cnt++;
                i++;
            }
            res.push_back(cnt);
        }
        sort(res.begin(),res.end());
        for(int i = 1;i<res.size();i++){
            if(res[i-1] == res[i]){
                return false;
            }
        }
        return true;
    }
};
