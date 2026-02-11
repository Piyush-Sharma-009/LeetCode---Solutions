class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        vector<int> ans;

        for(int i = 0;i<nums.size();i++){
        int leftsum = 0;
        int rightsum = 0;
        int j = i+1;
        int k = i-1;
                if(i == 0){
                    leftsum = 0;
                }
                if(i == nums.size()-1){
                    rightsum = 0;
                }
                while(j <nums.size()){
                    rightsum += nums[j];
                    j++;
                }
                while(k >= 0){
                    leftsum += nums[k];
                    k--;
                }
                ans.push_back(abs(leftsum - rightsum));
        }
        return ans;
    }
};
