class Solution {
    public int findMin(int[] nums) {
        // rotation --> the larger elements will always be on the leftmost sidelse

        int leftmost = 0;
        int rightmost = nums.length - 1;
        int curMin = nums[0];

        while(leftmost <= rightmost){

            if(nums[leftmost] < nums[rightmost]){
                curMin = Math.min(curMin, nums[leftmost]);

                return curMin;
            }

            int middle = (leftmost + rightmost) / 2;
            curMin = Math.min(curMin, nums[middle]);


            if(nums[middle] >= nums[leftmost]){
                leftmost = middle + 1;                
                
            }

            else {
                rightmost = middle - 1;
            } 
            
        }

        return curMin;
    }
}
