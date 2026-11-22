class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'A'] += 1;
            int width = i - j + 1;
            if (width <= k && max < width) {
                max = width;
            } else {
                // width > k
                int m = 0;
                char mc = 'A'; 
                for (int l = 0; l < freq.length; l++) {
                    if (m < freq[l]) {
                        m = freq[l];
                        mc = (char) ('A' + (char) l);
                    }
                }

                if (width - freq[mc - 'A'] <= k && max < width) {
                    max = width;
                } else {
                    freq[s.charAt(j) - 'A'] -= 1;
                    j++; 
                }
            }
        }

        return max;
    }
}
