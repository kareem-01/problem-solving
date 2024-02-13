package arrays;

public class BestTimeToBuyAndSellStock {


    public static void main(String[] args) {
        int[] prices = {3, 2, 6, 5, 0, 3};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int sellPrice = Integer.MIN_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
                sellPrice = Integer.MIN_VALUE;
                continue;
            }
            if (price > sellPrice)
                sellPrice = price;
            if (sellPrice - buyPrice > maxProfit)
                maxProfit = sellPrice - buyPrice;
        }
        return maxProfit;
    }


}
