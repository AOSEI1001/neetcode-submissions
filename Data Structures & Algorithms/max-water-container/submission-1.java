class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxHeight = 0;
        int curHeight = 0;
        int curDifference = 0;


        while(left < right){
            curDifference = right - left;
            curHeight = curDifference * Math.min(heights[left], heights[right]);

            if(curHeight > maxHeight){
                maxHeight = curHeight;

            }

            if(heights[left] > heights[right]){
                    right--;
            }
            else{
                left++;
            }
        }

        return maxHeight;
    }
}
