class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();

        for(int num : nums1){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(int num : nums2){
            if(map.containsKey(num) && map.get(num) >0){
                li.add(num);
                map.put(num,map.get(num) - 1);
            }
        }

        int[] arr = new int[li.size()];
        for(int i = 0;i<li.size();i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}
