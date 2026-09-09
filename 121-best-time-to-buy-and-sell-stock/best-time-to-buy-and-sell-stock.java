class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy = prices[0];
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]> bestbuy){
                maxProfit = Math.max(maxProfit, prices[i]-bestbuy);
            }
            bestbuy = Math.min(bestbuy , prices[i]);
        }
        return maxProfit;
    }
}