import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, b.maxProfit(prices1));
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, b.maxProfit(prices2));
    }
}
