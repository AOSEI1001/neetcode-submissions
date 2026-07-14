class Solution {
    public int maxProduct(int[] nums) {
        
        int finalProd = -1000;
        int curMaxProd = 1;
        int curMinProd = 1;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                curMaxProd = 1;
                curMinProd = 1;
            }

            int temp = curMaxProd;
            curMaxProd = Math.max(curMaxProd * nums[i], Math.max(nums[i] * curMinProd, nums[i]));
            curMinProd = Math.min(temp * nums[i], Math.min(nums[i] * curMinProd, nums[i]));
            
            

            finalProd = Math.max(finalProd, curMaxProd); 
                
        }

        return finalProd;

    }
}
