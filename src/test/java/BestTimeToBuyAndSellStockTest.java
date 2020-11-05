import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimeToBuyAndSellStockTest{
    @Test
    public void test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test1() {
        int[] prices = {7,6,4,3,1};
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void test2() {
        int[] prices = {2,4,1};
        assertEquals(2, BestTimeToBuyAndSellStock.maxProfit(prices));
    }
}