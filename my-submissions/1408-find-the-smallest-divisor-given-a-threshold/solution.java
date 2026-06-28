class Solution {
    static int remainder(int[] a, int d){
        int res = 0;

        for(int i : a){
            res += Math.ceil((double)i/d);
        }
        return res;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxi = Integer.MIN_VALUE;
        for(int i : nums){
            maxi = Math.max(maxi,i);
        }

        int low = 1, high = maxi, ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            int res = remainder(nums,mid);

            if(res <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else
            low = mid+ 1;
        }
        return ans;
    }
}
