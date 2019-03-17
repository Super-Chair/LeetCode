public class MaxProfit {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length; j++){
                if (maxProfit < (prices[j] - prices[i])){
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        return maxProfit;
    }

    /**
     * 动态规划
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int minProfit = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            if (minProfit > prices[i]) {
                minProfit = prices[i];
            }else if (prices[i] - minProfit > maxProfit){
                maxProfit = prices[i] - minProfit;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        MaxProfit maxProfit = new MaxProfit();
        int profit =  maxProfit.maxProfit2(arr);
        System.out.println(profit);
    }
}
