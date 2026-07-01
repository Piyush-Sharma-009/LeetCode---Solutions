class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     List<Integer> arr = new ArrayList<>();
     int i = 0, j = 0;
     while(i < nums1.length && j < nums2.length){
        if(nums1[i] < nums2[j]) arr.add(nums1[i++]);
        else arr.add(nums2[j++]);
     }
     while(i<nums1.length) arr.add(nums1[i++]);
     while(j < nums2.length) arr.add(nums2[j++]);

     if(arr.size() %2 == 1) return arr.get(arr.size()/2);
     return (double) ((double) (arr.get(arr.size()/2)) + (double)(arr.get(arr.size()/2 - 1)))/2.0;
    }
}
