class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        unordered_map<int,int> mpp;
        mpp[0] = 1;   // base case
        
        int prefixsum = 0;
        int cnt = 0;

        for(int i = 0; i < nums.size(); i++){
            prefixsum += nums[i];

            if(mpp.find(prefixsum - goal) != mpp.end()){
                cnt += mpp[prefixsum - goal];
            }

            mpp[prefixsum]++;
        }

        return cnt;
    }
};
