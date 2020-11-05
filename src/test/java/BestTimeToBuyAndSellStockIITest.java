import junit.framework.TestCase;
import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest extends TestCase {
    @Test
    public void test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(prices));
    }

    @Test
    public void test1() {
        int[] prices = {1, 2, 3, 4, 5};
        assertEquals(4, BestTimeToBuyAndSellStockII.maxProfit(prices));
    }

    @Test
    public void test2() {
        int[] prices = {7,6,4,3,1};
        assertEquals(0, BestTimeToBuyAndSellStockII.maxProfit(prices));
    }

}