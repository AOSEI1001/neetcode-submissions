class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int [] array = new int[amount + 1];
        Arrays.fill(array, amount + 1);

        array[0] = 0;

        for(int i = 1; i < amount + 1; i++){
            for(int j = 0; j < coins.length; j++){
                if (i - coins[j] >= 0){
                    array[i] = Math.min(array[i], 1 + array[i - coins[j]]);
                }
            }
        }

        if(array[amount] != amount + 1){
            return array[amount];
        }

        return -1;
    }
}
