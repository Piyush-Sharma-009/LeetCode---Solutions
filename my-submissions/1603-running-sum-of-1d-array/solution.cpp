class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> res;
        if(nums.size() == 0 || nums.size() == 1) return nums;
        res.push_back(nums[0]);
        for(int i = 1;i<nums.size();i++){
            res.push_back(res[i-1]+nums[i]);
        }
        return res;
    }
};
