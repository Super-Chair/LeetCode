public class CoinChange {

    /**
     * 动态规划构建
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if (amount == 0){
            return 0;
        }
        int[] cost = new int[amount + 1];
        for (int i = 0; i < amount+1; i++){
            cost[i] = amount + 1;
        }
        for (int j = 1; j < amount + 1; j++){
            for (int k = 0; k < coins.length; k++){
                if (j == coins[k]){
                    cost[j] = 1;
                }else {
                    if (j - coins[k] > 0) {
                        cost[j] = cost[j] > (cost[j - coins[k]] + 1) ? (cost[j - coins[k]] + 1) : cost[j];
                    }
                }
            }
        }

        return cost[amount] == amount + 1 ? -1 : cost[amount];

    }


    public static void main(String[] args) {
        //coins = [1, 2, 5], amount = 11
        int[] coins = {1,2,5};
        int amont = 11;
        System.out.println(new CoinChange().coinChange(coins, amont));
    }
}
