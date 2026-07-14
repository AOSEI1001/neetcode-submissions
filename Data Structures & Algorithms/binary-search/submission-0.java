class Solution {
    public int search(int[] nums, int target) {
        int leftMost = 0;
        int mid = nums.length / 2;
        int rightMost = nums.length;

        while(leftMost != rightMost){
            if(nums[mid] == target){
                return mid;
            }

            if (nums[mid] > target){
                rightMost--;
                mid = (leftMost + rightMost) / 2;
            }

            else if (nums[mid] < target){
                leftMost++;
                mid = (leftMost + rightMost) / 2;
            }
            
        }
        return -1;    

       
    }
}
