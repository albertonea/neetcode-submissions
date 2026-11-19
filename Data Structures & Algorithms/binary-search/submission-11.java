class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        else if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        } 

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int half = l + ((r - l) / 2);
            System.out.println(half);
            if (nums[half] < target) {
                l = half + 1;
            } else if (nums[half] > target) {
                r = half - 1;
            } else {
                return half;
            }

        }

        return -1;
    }
}
