class Solution {
    public int missingNumber(int[] nums) {

        int result = 0;
        int wanted = 0;
        int have = 0;

        for(int i = 0; i < nums.length + 1; i++){
            wanted += i;
        }

        for(int i = 0; i < nums.length; i++){
            have += nums[i];
        }

        result = wanted - have;
        return result;
    }
}
