class Solution {
public:
    bool search(vector<int>& nums, int target) {
        if(nums[0]==target) return true;
        if(nums.size() == 0) return false;
        int pivot = 0;
        for(int i = 0;i<nums.size()-1;i++){
            if(nums[i]>nums[i+1]){
                pivot = i;
                break;
            }
            pivot = i+1;
        }
    int low = 0;int high = pivot;
    while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid] == target)return true;
        else if(nums[mid]<target) low = mid+1;
        else
        high = mid -1;
    }
    low = pivot +1;high =  nums.size() -1;
    while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid] == target)return true;
        else if(nums[mid]<target) low = mid+1;
        else
        high = mid -1;
    }
return false;
    }
};
