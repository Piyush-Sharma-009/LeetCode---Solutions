class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        for(int i = 0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!li.isEmpty() && start <= li.get(li.size() -1).get(1)){
                continue;
            }
            for(int j = i + 1;j<n;j++){
                if(intervals[j][0] <= end){
                    end = Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(start);
            pair.add(end);
            li.add(pair);
            

        }
        int[][] ans = new int[li.size()][2];
        
        for(int i = 0; i < li.size();i++){
            ans[i][0] = li.get(i).get(0);
            ans[i][1] = li.get(i).get(1);
        }
        return ans ;
    }
}
