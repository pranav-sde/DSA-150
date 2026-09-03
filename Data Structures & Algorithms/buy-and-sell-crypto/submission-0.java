class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<=0){
            return 0;
        }
        int nge[] = new int[n];
        int large = 0;
        for(int i = n-1;i>=0;i--){
            large = Math.max(prices[i], large);
            nge[i] = large;
        }

        int maxProfit = 0;
        for(int i = 0;i<n;i++){
            int diff = nge[i] - prices[i];
            maxProfit = Math.max(maxProfit, diff);
        }

        return maxProfit;
    }
}
