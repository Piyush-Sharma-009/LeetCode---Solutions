class Solution {

    static int binaryS(int[] nums,int left, int right, int tar){
        if(left > right) return -1;
        int mid = left + (right - left)/2;
        if(nums[mid] == tar) return mid;
        else if(nums[mid] > tar) return binaryS(nums,left,mid-1,tar);
        else return binaryS(nums, mid+1, right, tar);
    }

    public int search(int[] nums, int target) {
        return binaryS(nums,0,nums.length-1,target);
    }
}
