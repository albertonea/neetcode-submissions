class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': 
                    stack.push('(');
                    break;
                case ')': 
                    if (stack.size() == 0 || stack.pop() != '(') return false;
                    break;
                case '{': 
                    stack.push('{');
                    break;
                case '}': 
                    if (stack.size() == 0 || stack.pop() != '{') return false;
                    break;
                case '[': 
                    stack.push('[');
                    break;
                case ']': 
                    if (stack.size() == 0 || stack.pop() != '[') return false;
                    break;
            }
        }

        return stack.size() == 0;
    }
}
