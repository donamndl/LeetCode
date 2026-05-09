class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int DailyProfit = prices[i] - prices[i - 1];
            MaxProfit = MaxProfit + Math.max(0, DailyProfit);
        }
        return MaxProfit;
    }
}