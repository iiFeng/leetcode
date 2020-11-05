/**
 * 122. Best Time to Buy and Sell Stock II
 * Say you have an array prices for which the ith element is the price of a given stock on day i.
 *
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];
            int perv = prices[i - 1];
            if (curr > perv) {
                sum += curr - perv;
            }
        }
        return sum;
    }
}