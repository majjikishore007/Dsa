package Easy;

class Solution {
    public int maxProfit(int[] prices) {
        int cp = prices[0];
        int profit = -1;

        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - cp;
            profit = Math.max(temp, profit);
            cp = Math.min(cp, prices[i]);
        }
        return profit;
    }
}