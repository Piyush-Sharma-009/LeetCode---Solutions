class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];

        for(int i : nums){
            arr[i]++;
        }

            int j = 0;
            int i = 0;
            while(j <3 ){
                while(arr[j] > 0 ){

                nums[i++] = j;
                arr[j]--;
                }
            j++;
            }
        return ;
    }
}
