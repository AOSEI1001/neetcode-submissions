class Solution {
    public int lengthOfLIS(int[] nums) {
        
        // cache
        int [] array = new int[nums.length];
        Arrays.fill(array, 1);

        int curMax = 1; 

        for(int i = nums.length - 1; i > -1; i--){
            for(int j = i + 1; j < nums.length; j++){

                if(nums[j] > nums[i]){
                    array[i] = Math.max(array[i], 1 + array[j]);

                    if(array[i] > curMax){
                        curMax = array[i];
                    }
                } 
            }
        }

        return curMax;


    }
}
