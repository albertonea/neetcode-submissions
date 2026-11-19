class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sequence = new HashSet<>();

        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sequence.contains(s.charAt(i))) {
                while (sequence.contains(s.charAt(i))) {
                    sequence.remove(s.charAt(j++));
                }
            }
            sequence.add(s.charAt(i));
            max = Math.max(i - j + 1, max);
        }

        return max;
    }
}
