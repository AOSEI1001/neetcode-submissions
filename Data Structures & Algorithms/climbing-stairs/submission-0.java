class Solution {
    public int climbStairs(int n) {
        
        // permutations -- how many forms of the array 0 1 2, can add to 2
        // 1 1, 0 2

        // base case: if number of steps and the current counted step 
        // is greater than the given number of steps


        int one = 1;
        int two = 1;
        int temp = 0;

        for (int i = 0; i < n - 1; i++){
            temp = one;
            one = one + two;
            two = temp;
        }


        return one;
    }
}
