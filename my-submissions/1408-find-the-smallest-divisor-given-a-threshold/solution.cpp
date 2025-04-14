class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int n=nums.size();
        int l = 1;
        int maxi = *max_element(nums.begin(), nums.end());
        if(n==threshold) return maxi;
        int ans = maxi;

        while (l <= maxi) {
            int mid = (l + maxi) / 2;
            int sum = 0;

            for (int it : nums) {
                sum += (it + mid - 1) / mid;
            }

            if (sum <= threshold) {
                ans = mid;           
                maxi = mid - 1;
            } else {
                l = mid + 1;      
            }
        }

        return ans;
    }
};
