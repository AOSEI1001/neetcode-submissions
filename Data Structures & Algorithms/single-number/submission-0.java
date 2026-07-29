class Solution {
    public int singleNumber(int[] nums) {
        int test = 0;

        for(int i = 0; i < nums.length; i++){
             test ^= nums[i];
        }

        return test;
        

        
    }
}
