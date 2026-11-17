class Solution {
    public boolean isPalindrome(String s) {
        String f = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String b = new StringBuilder(f).reverse().toString();
        return f.equals(b);
    }
}
