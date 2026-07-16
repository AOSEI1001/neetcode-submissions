class Solution {
    public int[] countBits(int n) {
        
        int [] output = new int[n + 1];
        
        for(int i = 0; i < n + 1; i++){
            int curCount = 0;
            int j = i;

            if(i == 0){
                curCount = curCount;
            }

            while(j != 0){
            
                if(j % 2 == 1){
                    curCount++;
                }

                j = j >>> 1;
            }

            output[i] = curCount;
           
        }

        return output;
    }
}
