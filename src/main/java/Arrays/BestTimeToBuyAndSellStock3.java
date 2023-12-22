package Arrays;

public class BestTimeToBuyAndSellStock3 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    //[3,3,5,0,0,3,1,4]
    public static int maxProfit(int[] prices) {
        int sell1 = 0, sell2 = 0, buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }

    int maxProfit = 0;

    public int maxProfit(int[] prices, int i, int noOfTransaction, int currentProfit, boolean bought, int boughtIndex) {
        if (i == prices.length || noOfTransaction == 0) {
            maxProfit = Math.max(maxProfit, currentProfit);
            return maxProfit;
        }
        if (bought) {
            int ans1 = 0;
            if (prices[i] - prices[boughtIndex] > 0)
                ans1 = maxProfit(prices, i + 1, noOfTransaction - 1, currentProfit + (prices[i] - prices[boughtIndex]), false, -1);
            int ans2 = maxProfit(prices, i + 1, noOfTransaction, currentProfit, true, boughtIndex);
            return Math.max(ans1, ans2);
        } else {
            int ans1 = maxProfit(prices, i + 1, noOfTransaction, currentProfit, true, i);
            int ans2 = maxProfit(prices, i + 1, noOfTransaction, currentProfit, false, i);
            return Math.max(ans1, ans2);
        }
    }

    public int maxProfitBruteForce(int[] prices) {
        return maxProfit(prices, 0, 2, 0, false, -1);
    }
}
