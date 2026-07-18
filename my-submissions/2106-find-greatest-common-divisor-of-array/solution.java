class Solution {
    static int gcd(int a, int b){
        if(b == 0) return a ;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int mini = nums[0];
        int maxi = nums[0];

        for(int i : nums){
            mini = Math.min(mini,i);
            maxi = Math.max(maxi,i);
        }

        return gcd(mini,maxi);
    }
}
