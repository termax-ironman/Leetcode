class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keep = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i < nums.length;i++) {
            if(keep.get(nums[i]) != null) {
                res[0] = keep.get(nums[i]);
                res[1] = i;
                return res;
            }
            else {
                keep.put(target-nums[i], i);
            }
        }
        return res;
    }
}