class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count =0;
        int maxcount = 0;
        for(int i =0;i<nums.size();i++){
            if( nums[i] != 0)
            count++;
            else{
                if(maxcount<count){
                maxcount = count;
                }
                count =0;
            }
        }
        if(count>maxcount){
            return count;
        }
        return maxcount;
    }
};
