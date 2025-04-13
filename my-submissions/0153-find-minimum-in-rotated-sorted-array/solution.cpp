class Solution {
public:
    int findMin(vector<int>& nums) {
        if(nums.size() == 1)
        return nums[0];
        if(nums.size() == 0)
        return 0;
        
        int pivot = 0;
        for(int i = 0;i<nums.size() -2;i++){
            if(nums[i]>nums[i+1]){
                pivot = i;
                break;
            }
            pivot = i+1;
        }
       
       return min(nums[0],nums[pivot+1]);
    }
};
