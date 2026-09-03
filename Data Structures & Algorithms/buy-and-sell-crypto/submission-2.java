class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=0){
            return 0;
        }
        int i = 0;
        int j = 1;
        int maxProfit = 0;
        while(j<n){
            if(prices[i]< prices[j]){
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }else {
                i = j;
            }
            j++;
        }
        return maxProfit;
    }
}
