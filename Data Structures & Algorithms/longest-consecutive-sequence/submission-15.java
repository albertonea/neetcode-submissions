class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int len = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int i = 1;
                while (set.contains(num + i)) {
                    i++;
                }
                
                if (i > len) {
                    len = i;
                }
            }
        }

        return len;
    }
}
