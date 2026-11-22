class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                Integer a = stk.pop();
                Integer b = stk.pop();
                stk.push(b + a); 
            } else if (s.equals("-")) {

                Integer a = stk.pop();
                Integer b = stk.pop();
                stk.push(b - a); 
            } else if (s.equals("*")) {

                Integer a = stk.pop();
                Integer b = stk.pop();
                stk.push(b * a); 
            } else if (s.equals("/")) {
                Integer a = stk.pop();
                Integer b = stk.pop();
                stk.push((int) (b / a)); 

            } else {
                stk.push(Integer.parseInt(s));
            }
        }

        return stk.pop();
    }
}
