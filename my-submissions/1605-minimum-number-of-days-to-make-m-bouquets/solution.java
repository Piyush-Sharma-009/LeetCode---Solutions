class Solution {
    static int isBlooms(int[] a, int m, int k, int d){
        int cnt = 0;
        int ans = 0;
        for(int i : a){
            if(i <= d){
                cnt++;
            }
            else{
                ans += cnt/k;
                cnt = 0;
            }
        }
        ans += cnt/k;

        return ans;
        

    }
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < (long)m*k) return -1;
        int minE = bloomDay[0];
        int maxE = bloomDay[0];

        for(int i : bloomDay){
            minE = Math.min(minE,i);
            maxE = Math.max(maxE,i);
        }
        int low = minE;
        int high = maxE;
        int ans = maxE;
        while(low <= high){
            
            int mid = low + (high - low)/2;

            int totalBouq = isBlooms(bloomDay,m,k,mid);
            
            if(totalBouq >= m ){
                ans = Math.min(mid,ans);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
}
}
