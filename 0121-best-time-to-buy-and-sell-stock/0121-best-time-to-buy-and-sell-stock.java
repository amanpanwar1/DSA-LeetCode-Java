class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int MP = 0;
        int buyprice = prices[0];
        for(int i =1 ; i<n; i++) {
            int current_profit = prices[i] - buyprice;
            if(current_profit > MP) {
                MP = current_profit;
            } 
            if (prices[i] < buyprice) {
                buyprice = prices[i];
            }
        }
        return MP;
    }
}