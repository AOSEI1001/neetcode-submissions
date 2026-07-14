class Solution {
    public int maxProfit(int[] prices) {

        int left = 0;
        int right = 1;

        int curMax = 0;

        while (right != prices.length){
            if (prices[left] < prices[right]){
                if(prices[right] - prices[left] > curMax){
                    curMax = prices[right] - prices[left];
                }
                
            }

            else if (prices[left] > prices[right]){
                left = right;
                
            }
            right++;
        }

        return curMax; 

        
    }
}
