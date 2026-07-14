class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] output = new int [nums.length];
        Arrays.fill(output, 1);

        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++){
            output[i] = prefix;
            prefix = prefix * nums[i];
        }

        for (int i = nums.length - 1; i > -1; i--){
            output[i] *= postfix;
            postfix *= nums[i];
        }

        

        return output;
    }
}  
