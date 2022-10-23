package Arrays;

public class Stocks {
    public static void BuySellStocks(int prices[]){
           int buyprice=Integer.MAX_VALUE;
           int maxprofit=0;
           for(int i=0;i<prices.length;i++){
               if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                 maxprofit=Math.max(maxprofit, profit);
               }else{
                buyprice=prices[i];
               }
           }
           System.out.println("maximum profit : "+maxprofit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        BuySellStocks( prices);
    }
}
