class Solution {
    public int reverseBits(int n) {

        int output = 0;
        // intuitive solution 
        // convert n to array of bits  
        // for loop starting from the end of the int array to the start 
        // place "new bits" in a new bit array 
        // convert back to int 

        for(int i = 0; i < 32; i++){
            int bit = (n >> i) & 1;
            output = output | (bit << (31 - i));
        }


        return output;
        
    }
}
