class Solution {
    static long calculateHrs(int[] a, int h){
        long hrs = 0;
        for(int i : a){
            hrs += Math.ceil((double) i/h);
        }
        return hrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxE = piles[0];
        for(int i : piles){
            maxE = Math.max(i,maxE);
        }

        int low = 1,high = maxE;
        int ans = maxE;
        while(low <= high){
            int mid = low +  (high - low)/2;
            long hrs = calculateHrs(piles, mid);
            if(hrs<=h){
                ans = Math.min(ans,mid);
                high = mid -1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}
