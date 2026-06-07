class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int num : nums2){
            if(set.contains(num)){
                li.add(num);
                set.remove(num);
            }
        }
        int[] arr = new int[li.size()];
        for(int i =0 ;i<li.size();i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}
