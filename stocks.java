public class stocks {
    public static int buyandsellstocks(int prices[]) {
        int buyprice=Integer.MAX_VALUE;
        int max_profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if (buyprice>prices[i]) {
                buyprice=prices[i];
            }
            else{
                int profit=prices[i]-buyprice;
                max_profit=Math.max(profit,max_profit);
            }
        }
        return max_profit;
        
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));

    }
}
