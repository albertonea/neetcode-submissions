class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList();
        for (String str:strs) {
            addAnagram(anagrams, str);
        }

        return anagrams;
    }

    public void addAnagram(List<List<String>> anagrams, String string) {
        for (int i = 0; i < anagrams.size(); i++) {
            String level = anagrams.get(i).get(0);
            if (isAnagram(level, string)) {
                anagrams.get(i).add(string);
                return;
            }
        }

        List<String> newAnagram = new ArrayList();
        newAnagram.add(string);
        anagrams.add(newAnagram);
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] chars = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            Character c = s1.charAt(i); 
            chars[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            Character c = s2.charAt(i); 
            chars[c - 'a']--;
            if (chars[c - 'a'] < 0) return false;
        }

        return true;
    }
}
