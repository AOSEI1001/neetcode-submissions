class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> reached = new ArrayList<>();
        List<Integer> curRes = new ArrayList<>();

        combinationSumHelper(0, 0, reached, curRes, target, nums);

        return reached;
    }

    public void combinationSumHelper(int i, int total, List<List<Integer>> reached, List<Integer>  curRes, int target, int [] nums){
        
        if(total == target){
            reached.add(new ArrayList<>(curRes));
            return;
        }

        if(i >= nums.length || total > target){
            return;
        }

        curRes.add(nums[i]);
        combinationSumHelper(i, total + nums[i], reached, curRes, target, nums);
        curRes.remove(curRes.size() - 1);
        combinationSumHelper(i + 1, total, reached, curRes, target, nums);
    }
}
