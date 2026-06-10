class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >-1){
            arr[j] = nums[i];
            j = j+2;
            if(j == nums.length || j > nums.length)
                break;
            }
        }
        j = 1;
        for(int i : nums){
            if(i < 0){
                arr[j] = i;
                j = j+2;
                if(j == nums.length || j > nums.length)
                break;
            }
        }
        return arr;
    }
}
