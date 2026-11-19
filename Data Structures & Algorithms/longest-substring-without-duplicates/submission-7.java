class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sequence = new HashSet<>();

        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sequence.contains(s.charAt(i))) {
                if (max < i - j) {
                    max = i - j;
                }

                while (sequence.contains(s.charAt(i))) {
                    sequence.remove(s.charAt(j++));
                }
            }
            sequence.add(s.charAt(i));
        }


        if (max < s.length() - j) {
            max = s.length() - j;
        }

        return max;
    }
}
