class Solution {
    boolean isLarSum(int[] arr, int sum, int k){
        int cntSubArr = 1, totalSum = 0;
        for(int i : arr){
            if(i > sum) return false;
            if(totalSum + i > sum){
                cntSubArr++;
                totalSum = i;
            }
            else totalSum += i;
        }
        if(cntSubArr > k) return false;
        return true;
    }
    public int splitArray(int[] nums, int k) {
    
        int maxSum = 0;
        int maxE = -1;
        for(int i : nums){
            maxSum += i;
            maxE = Math.max(maxE,i);
        }
        int low = maxE, high = maxSum;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isLarSum(nums,mid,k)){
                high = mid -1;
            }
            else 
            low = mid + 1;
        }
        return low ;
    }
}
