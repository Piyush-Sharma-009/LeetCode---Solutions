class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        //base case 1
        //if size is 0 
        if(n <3)
        return {};
        // base case2 
        //if first element is greator than 0,then we never find sum  = 0
        if(nums[0] >0)
        return {};
        // set<vector<int>> st;
        vector<vector<int>> res;
        for(int i = 0;i<n;++i){
            //fixed value greator than 0
            if(nums[i]>0)
            break;
            //skip duplicates
            if(i>0 && nums[i] == nums[i-1])
            continue;
            int low = i+1;
            int high = n-1;
            int sum = 0;
            while(low <high)
            {
                sum = nums[i] + nums[low] + nums[high];
                if(sum < 0)
                low++;
                else if(sum >0)
                high--;
                else {
                    res.push_back({nums[i],nums[low],nums[high]}); //we have found the required triplet, push it in answer vector
                    int last_low_occur = nums[low], last_high_occur = nums[high]; //Now again, to avoid duplicate triplets, we have to navigate to last occurences of num[low] and num[high] respectively
                    while(low <high && nums[low] == last_low_occur) // Update the low and high with last occurences of low and high.
                    {
                        low++;
                    }
                    while(low <high && nums[high] == last_high_occur)
                    {
                        high--;
                    }
                }
            }
        }
        return res;
    }
};
