class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int count = 0;
        for(int i = 0;i<nums.size();i++){
            int flg = 0;
            int temp = nums[i];
            while(temp> 0){
                flg++;
                temp /=10;
            }
            if(flg %2 == 0){
                count++;
            }
        }
        return count;
    }
};
