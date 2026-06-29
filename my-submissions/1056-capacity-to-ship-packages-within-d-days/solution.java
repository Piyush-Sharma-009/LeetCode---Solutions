class Solution {
    static int totalDays(int[] a, int capacity){
        int sum = 0;
        int day = 1;
        for(int i : a){
            if(sum + i > capacity){
            day++;
            sum = i;
            }
            else{
                sum += i;
            }
        }
        
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxw = weights[0];
        int sum = 0;
        for(int i : weights){
            maxw = Math.max(maxw,i);
            sum += i;
        }
        int ans = sum;
        int low = maxw;
        int high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            int d = totalDays(weights,mid);
            if(d<=days){
                ans = mid ;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
}
