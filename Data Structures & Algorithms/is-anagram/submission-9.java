class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] chars = new int[26];

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            chars[c - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            chars[c - 'a'] -= 1;
            if (chars[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
