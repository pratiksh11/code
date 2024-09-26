import java.util.*;
public class buyStocks{
   public static int stocksProf(int prices[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<prices.length;i++){
     if(buyPrice<prices[i]){
     int profit=prices[i]-buyPrice;
     maxProfit=Math.max(maxProfit,profit);
    }else{
        buyPrice=prices[i];
    }
  }
   return maxProfit;
   }
  
    public static void main(String args[]){
        int prices[]={7,4,8,1,9};
        System.out.println(stocksProf(prices));
    }
}