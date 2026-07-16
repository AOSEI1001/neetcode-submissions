class Solution {
    public int maxArea(int[] heights) {
        
        int maxHeight = 0;
        int curHeight = 0;
        int curDifference = 0;

        for (int i = 0; i < heights.length; i++){
            for(int j = i + 1; j < heights.length; j++){

                curDifference = Math.abs(j - i); //10

                if(heights[j] <= heights[i]){
                    curHeight = curDifference * heights[j];
                }
                else{
                    curHeight = curDifference * heights[i];
                }

                if(curHeight > maxHeight){
                    maxHeight = curHeight;
                }
            }
        }

        return maxHeight;
    }
}
