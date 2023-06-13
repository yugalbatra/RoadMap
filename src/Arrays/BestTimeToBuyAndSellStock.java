package Arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (min > price) {
                min = price;
                continue;
            }
            if (price - min > maxProfit) {
                maxProfit = price - min;
            }
        }
        return maxProfit;
    }
}