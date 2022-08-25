package Arrays;

public class StockBuySellOnce {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int price : prices) {
            if (price < min) min = price;
            else if (price - min > maxDiff) maxDiff = price - min;
        }
        return maxDiff;
    }
}
