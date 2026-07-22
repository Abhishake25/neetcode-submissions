class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        int current_profit = 0;
        int n = prices.length;

        for(int i=1; i<n; i++){
            if(prices[i]<min_price){
                min_price = prices[i];
            }

            else if(prices[i]>=min_price){
                current_profit = prices[i] - min_price;
                max_profit = Math.max(max_profit,current_profit);
            }

        }
        return max_profit;

    }
}
