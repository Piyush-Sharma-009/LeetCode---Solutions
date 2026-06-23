class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = (m + n);
        int gap = len/2 + len % 2;

        while(gap > 0){
            int left = 0;
            int right = left + gap;

            while(right < len){
                if(left < m && right >= m){
                    if(nums1[left] > nums2[right - m]){
                    int temp = nums1[left];
                    nums1[left] = nums2[right-m];
                    nums2[right-m] = temp;
                    }
                }
                else if(left >=m){
                    if(nums2[left-m] > nums2[right - m]){
                    int temp = nums2[left - m];
                    nums2[left-m] = nums2[right-m];
                    nums2[right-m] = temp;
                    }
                }
                else{
                    if(nums1[left] > nums1[right]){
                    int temp = nums1[left];
                    nums1[left] = nums1[right];
                    nums1[right] = temp;
                    }
                }
                left++;
                right++;
                }
                if(gap == 1) break;
                gap = gap/2 + gap%2;
                }

                int i = m;
                for(int j = 0 ;j<n;j++){
                    nums1[i++] = nums2[j];
                }
                return ;
            }
    }
