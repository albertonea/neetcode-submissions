class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndex = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            numberIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer j = numberIndex.get(target - nums[i]);
            if (j != null && j != i) {
                return new int[]{i, j};
            }
        }

        return new int[2];
    }
}
