class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    if(m == 1 && n == 0)    
    return ;
    else if ( m == 0 && n == 1){
    nums1[0] = nums2[0];
    return ;
    }
    for(int i = 0;i<n;i++){
        nums1[m+i] = nums2[i];
    }
    sort(nums1.begin(),nums1.end());
    return ;
    }
};
