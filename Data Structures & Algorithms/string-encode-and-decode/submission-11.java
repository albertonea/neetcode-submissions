class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('#', i);
            int size = Integer.parseInt(str.substring(i, slash));
            i = slash + 1;
            decoded.add(str.substring(i, i + size));
            i += size;
        }

        return decoded;
    }
}
