package com.example.buy_sell_stocks;
import java.util.*;
/**
 * This App service given an array say. prices where prices[i] is the price of a given stock on the ith day,
   Maximizes your profit by choosing a single day to buy one stock 
   and choosing a different day in the future to sell that stock.
   maxProfit() returns the maximum profit you can achieve from this transaction.
   If no profit is achieved it returns 0.
 *
 */
public class App 
{   
    public static int maxProfit(List<Integer> pricesList) {
        int profit = 0; 
        int[] prices = pricesList.stream().mapToInt(Integer::intValue).toArray();
        int minprice = prices[0]; // assume first price as minprice.
        for(int i=1; i<prices.length; i++){
            if(prices[i] > minprice){ // check if next ele is greater than minprice or not.
                profit = Math.max(profit, prices[i] - minprice);
            }
            minprice = Math.min(minprice, prices[i]); // if not update the minprice to next ele.
        }
        return profit;
    }
    public static void main( String[] args )
    {
        // prices[i] is the price of a given stock on the ith day.
        List<Integer> prices = Arrays.asList(7,1,5,3,6,4);
        // Expected maximum profit: 5
        // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        // Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        System.out.println("maximum profit: "+maxProfit(prices));
    }
}
