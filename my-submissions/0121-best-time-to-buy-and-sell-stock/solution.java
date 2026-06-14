class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxPrice = 0;

        for(int i = 1; i<prices.length;i++){
            if(min_price > prices[i]){
                min_price = prices[i];
            }
            else{
                maxPrice = Math.max(maxPrice, prices[i] - min_price);
            }
        }
        return maxPrice;
    }
}
