class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndex = new HashMap();

        for (int i = 0; i < nums.length; i++) {
        }

        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];

            if (numberIndex.containsKey(t)) {
                return new int[]{numberIndex.get(t), i};
            }

            numberIndex.put(nums[i], i);
        }

        return new int[2];
    }
}
