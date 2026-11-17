class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] chars = new int[Character.MAX_VALUE];

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            chars[c] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            chars[c] -= 1;
            if (chars[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
