class Solution {
public:
    int missingNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int lastnum = nums.size();
        if(nums[0] != 0)
            return 0;
        for(int i = 0;i<nums.size();i++){
            if(nums[i] != i){
                lastnum = i;
                break;
            }
        }
        
            return lastnum;
        
    }
};
