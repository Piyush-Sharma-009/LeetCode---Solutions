class Solution {
    public int[] replaceElements(int[] arr) {
        int maxri = -1;
        for(int i = arr.length - 1;i>=0;i--){
            int curr = arr[i];
            arr[i] = maxri;
            maxri = Math.max(curr,maxri);
        }
        return arr;
    }
}
