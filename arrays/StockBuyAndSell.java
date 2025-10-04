public class StockBuyAndSell {

    /*
     * Time Complexity - O(N)
     * N is the number of elements in the array
     * 
     * Space Complexity - O(1)
     * As no extra space is being used
     * 
     */
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            // while we consider each stock, pick the min stock price.
            if (prices[i] < min) {
                min = prices[i];
            }

            // calculate the max profit after buying the lower stock price and selling on
            // higher price
            max = Math.max(max, prices[i + 1] - min);
        }

        if (max < 0)
            max = 0;

        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(prices);

        System.out.println("Maximum profit after buying and selling stock: " + profit);
    }
}
