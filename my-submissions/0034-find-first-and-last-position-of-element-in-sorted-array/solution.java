class Solution {
    static int lower_bound(int[] nums,int tar){
        int low = 0;
        int high = nums.length - 1;

        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= tar){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    static int higher_bound(int[] arr,int tar){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] <= tar){
                ans = mid;
                low = mid + 1;
            }
            else    high = mid -1;
        }
        return ans;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int first = lower_bound(nums,target);
        if(first == nums.length || nums[first] != target) return new int[] {-1,-1};
        int last = higher_bound(nums,target);

        return new int[] {first, last};

    }
}
