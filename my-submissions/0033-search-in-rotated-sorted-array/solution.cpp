class Solution {
public:
    int search(vector<int>& nums, int target) {
        if(nums.size() == 0)
        return -1;
        if(nums[0] == target){
            return 0;
        }
        int n = nums.size();
        int pivot = findpivot(nums);
        
        int low = 0;
        int high = pivot ;
        while(low<= high){
            int mid = (low + high)/2;
            if(nums[mid] == target)
            return mid;
            else if(nums[mid]<target){
                low = mid +1;
            }
            else 
            high = mid -1;
        }

        low = pivot +1;
        high = n-1;

         while(low<= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
            return mid;
            }
            else if(nums[mid]<target){
                low = mid +1;
            }
            else 
            high = mid -1;
    }
    return -1;
        }

        int findpivot(vector<int> &nums){
            int low = 0;
            int high = nums.size() -1;
            if(nums[low]<nums[high]) return nums.size() -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(mid < nums.size()-1 && nums[mid]>nums[mid+1]) return mid;
                if(nums[mid]>=nums[low])
                low = mid +1;
                else 
                high =mid -1;
            }
            return nums.size() -1;
        }
};
