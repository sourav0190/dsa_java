public class BuyAndSellTwoTransactions {
    public static int maxProfit(int[] prices) {
        int buy1 = Integer.MAX_VALUE;
        int profit1 = 0;
        int buy2 = Integer.MAX_VALUE;
        int profit2 = 0;

        for (int i = 0; i < prices.length; i++) {
            // First buy: find the minimum price
            buy1 = Math.min(buy1, prices[i]);

            // First sell: max profit if sold now
            profit1 = Math.max(profit1, prices[i] - buy1);

            // Second buy: effective cost is current price minus profit1
            buy2 = Math.min(buy2, prices[i] - profit1);

            // Second sell: max profit if sold now (after 2nd buy)
            profit2 = Math.max(profit2, prices[i] - buy2);
        }

        return profit2;
    }

    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println("Maximum Profit with at most 2 transactions: " + maxProfit(prices));
    }
}
