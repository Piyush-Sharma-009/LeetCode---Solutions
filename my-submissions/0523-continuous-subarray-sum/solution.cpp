class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> mpp;
        mpp[0] = -1;
        int prefixsum = 0;

        for(int i = 0;i<nums.size();i++){
            prefixsum += nums[i];

            int rem = prefixsum%k;
            if(rem < 0) rem +=k;

            if(mpp.find(rem) != mpp.end()){
                if(i - mpp[rem] >1 ) return true;
            }
            else
            mpp[rem] = i;
        }
        return false;
        
    }
};
