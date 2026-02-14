class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int sum = 0;
        for(int i =0;i<nums.size();i++){
            sum += nums[i];
        }
        int i = 0;
        int lsum = 0;
        while(i < nums.size()){
            lsum += nums[i];
            if(lsum == sum - (lsum - nums[i]))
                return i;
            i++;
        }
        return  -1;
    }
};
