package ArraysAndStrings;

public class BuySellTwo {


        public int maxProfit(int[] prices) {

            int low = 0;
            int high = 0;
            int profit = 0;

            for(int i=0;i+1<prices.length;i++){
                if(prices[i] < prices[i+1]) {
                    if(low == 0) {
                        low = prices[i];
                    }
                    high = prices[i+1];
                }
                else if(prices[i] > prices[i+1]) {
                    profit = profit + (high - low);
                    low = 0;
                }
                //else if (profit == 0 && i == prices.length)
            }

            System.out.println("profit : " + profit);
            return profit;
        }



}

/*
class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int sell = prices[0];
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > buy) {
                sell =  prices[i];
                profit = profit = profit + (sell -buy);
                buy = prices[i];
            }
            }
    return profit;
    }

}
 */