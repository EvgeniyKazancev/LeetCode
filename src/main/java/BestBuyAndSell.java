import java.util.Arrays;
import java.util.OptionalInt;

public class BestBuyAndSell {
    public static void main(String[] args) {
        BestBuyAndSell bp = new BestBuyAndSell();
        int[] prices = {7,1,5,3,6,4};
       int result =  bp.maxProfit(prices);
        System.out.println(result);
    }
    public int maxProfit(int[] prices) {

           int maxPr = 0;
           int min = Integer.MAX_VALUE;

           for (int i = 0; i < prices.length; i++) {
               if (prices[i] <  min){
                   min = prices[i];
               }
               maxPr = Math.max(maxPr,prices[i] - min);
           }

        return maxPr;
    }
}