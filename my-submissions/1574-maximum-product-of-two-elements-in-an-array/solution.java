class Solution {
    public int maxProduct(int[] nums) {
     int firstMax = Integer.MIN_VALUE;   
     int secMax = Integer.MIN_VALUE;   
     int idx = 0;
     for(int i = 0;i<nums.length;i++){
        if(nums[i] > firstMax){
            firstMax = nums[i];
            idx = i;
        }
     }

      for(int i = 0;i<nums.length;i++){
        if(nums[i] > secMax && i != idx){
            secMax = nums[i];
        }
     }
     return (firstMax - 1)*(secMax - 1);
    }
}
