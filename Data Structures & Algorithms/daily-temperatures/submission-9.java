class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];

            while (!s.isEmpty() && temperatures[s.peek()] < temp) {
                int idx = s.pop();
                result[idx] = i - idx;
            }

            s.push(i);
        }

        return result;

    }
}
