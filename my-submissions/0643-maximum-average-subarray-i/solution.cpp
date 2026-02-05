class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double currAvg = 0;
        double maxAvg = INT_MIN;
        int n = nums.size();
        double sum = 0;
        double K= k;
        for(int i = 0;i<K;i++){
            sum +=nums[i];
        }
        currAvg = sum/k;
        maxAvg = max(currAvg,maxAvg);
        for(int i = K;i<n;i++){
            int newEle = nums[i];
            int oldEle = nums[i-k];
            sum = sum + newEle - oldEle;
            currAvg = sum/k;
        maxAvg = max(currAvg,maxAvg);
        }
        return maxAvg;
    }
};
