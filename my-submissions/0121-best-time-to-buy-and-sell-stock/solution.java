class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 ) return 0;
        int min_price = prices[0];
        int maxP = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }

            else{
                int curr_profit = prices[i] - min_price;
                maxP = Math.max(curr_profit,maxP );
            }
            
        }
        return maxP;
    }
}
