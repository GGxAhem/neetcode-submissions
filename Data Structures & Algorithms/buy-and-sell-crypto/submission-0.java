class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for(int j=0; j<prices.length-1; j++){
            for(int i =j+1; i< prices.length; i++){
                int profit = prices[i] - prices[j];
                if (profit > maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
 }
}
