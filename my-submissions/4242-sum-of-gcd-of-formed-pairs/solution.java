class Solution {
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
        
    }
    public long gcdSum(int[] nums) {
        ArrayList<Integer> prefixGcd = new ArrayList<>();
        int mxi = nums[0];
        for(int i = 0;i<nums.length;i++){
            mxi = Math.max(nums[i],mxi);
            prefixGcd.add(gcd(nums[i],mxi));
        }
        Collections.sort(prefixGcd);

        int low =0,high = prefixGcd.size() -1;
        long sum = 0;
        while(low < high){
            sum += gcd(prefixGcd.get(low),prefixGcd.get(high));
            low++;
            high--;
        }
        return (long)sum;


    }
}
