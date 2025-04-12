class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res = {-1,-1};
        int lb = lowerbound(nums,target);
        if(lb == nums.size()|| nums[lb] != target )
        return res;
        int ub = upperbound(nums,target) -1;
        res[0] = lb;
        res[1] = ub;
        return res;
    }

    int lowerbound(vector<int> &nums,int tar){
        
     return lower_bound(nums.begin(),nums.end(),tar) - nums.begin();
        
    }
    int upperbound(vector<int> &nums,int tar){
        
       return   upper_bound(nums.begin(),nums.end(),tar) - nums.begin();
        
    }
};
