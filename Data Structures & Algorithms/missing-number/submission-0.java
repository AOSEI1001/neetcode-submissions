class Solution {
    public static int missingNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for(int i = 0; i < nums.length + 1; i++){
            map.put(i, i);
            
        }

        System.out.println(map);
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
            
        }

        for(int key: map.keySet()){
            result = key;
        }

        return result;
    }

}