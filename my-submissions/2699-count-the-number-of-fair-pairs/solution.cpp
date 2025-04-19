class Solution {
public:
    long long countFairPairs(vector<int>& nums, int lower, int upper) {
        long long ans = 0;
        sort(nums.begin(),nums.end());
        for(int i = 0;i<nums.size();i++){
            int minreq = lower-nums[i],maxreq =upper - nums[i];
            auto high = upper_bound(nums.begin()+i+1,nums.end(),maxreq);
            auto low = lower_bound(nums.begin()+i+1,nums.end(),minreq);
            ans += (high - low);
        }
        return ans;
    }
};
