class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        if(n <= 1) return intervals;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<List<Integer>> li = new ArrayList<>();
        li.add(Arrays.asList(intervals[0][0],intervals[0][1]));

        int i = 1;
        while(i<n){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(li.get(li.size() - 1).get(1) >= start ){
                List<Integer> row = li.get(li.size() - 1);
                row.set(1,Math.max(end,li.get(li.size() - 1).get(1)));
            }
            else{
                li.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            i++;
        }
        int[][] ans = new int[li.size()][2];
        for(i = 0;i<li.size();i++){
            ans[i][0] = li.get(i).get(0);
            ans[i][1] = li.get(i).get(1);
        }
        return ans;
    }
}
