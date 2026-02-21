class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans;
        int pro=1;
        int pronz = 1;
        int zero =0;

        for(int i =0 ;i<nums.size();i++){
            pro *= nums[i];
            if(nums[i] == 0)
                zero = i;
        }

        for(int i =0;i<nums.size();i++){
            if(i != zero){
                pronz  *= nums[i];
            }
        }

        for(int i =0;i<nums.size();i++){
            int temp = pro;
            if(nums[i] != 0)
            ans.push_back(temp/nums[i]);
            else
            ans.push_back(pronz);
        }
        return ans;
    }
};
