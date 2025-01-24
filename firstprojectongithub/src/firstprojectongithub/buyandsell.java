package firstprojectongithub;

public class buyandsell {
	static int calculateMaximumProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0; // Edge case check

        int maxProfit = 0;
        int minPrice = prices[0]; // Initialize the minimum price with the first price

        // Iterate through the price array
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - minPrice; // Calculate profit for the current price
            maxProfit = Math.max(maxProfit, currentProfit); // Update max profit if current profit is higher
            minPrice = Math.min(minPrice, prices[i]); // Update minimum price if current price is lower
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("The maximum profit by selling the stock is: " + calculateMaximumProfit(prices));
    }

}
