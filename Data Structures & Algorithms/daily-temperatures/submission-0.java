class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length - 1; i++) {
            int temp = temperatures[i];
            for (int j = i + 1; j < temperatures.length; j++) {
                int next = temperatures[j];
                if (next > temp) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        result[result.length - 1] = 0;
        return result;

    }
}
