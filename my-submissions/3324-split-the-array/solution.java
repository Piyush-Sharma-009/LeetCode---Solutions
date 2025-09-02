class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length%2 !=0)
        return false;
        Arrays.sort(nums);
        int big = nums[nums.length - 1];
        int[] freq = new int[big+1];
        for(int i = 0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>2)
            return false;
        }
        return true;
    }
}
