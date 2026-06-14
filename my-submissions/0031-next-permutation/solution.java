class Solution {
    public void nextPermutation(int[] nums) {
        int pivotIdx = -1;
        int n = nums.length ;

        for(int i = n -1;i>0;i--){
            if(nums[i-1] < nums[i]){
                pivotIdx = i - 1;
                break;
            }
        }
        if(pivotIdx != -1){
            for(int i = n - 1;i>pivotIdx;i--){
                if(nums[i] > nums[pivotIdx]){
                    int temp = nums[i];
                    nums[i] = nums[pivotIdx];
                    nums[pivotIdx] = temp;
                    break;
                }
            }
        }

            int l = pivotIdx + 1;
            int r = n-1;

            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }

            return;


    }
}
