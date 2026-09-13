class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        // prices = [10,2,5,6,7,1]
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}