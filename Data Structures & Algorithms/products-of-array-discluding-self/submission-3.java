class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1]; 
        }

        int[] backwards = new int[nums.length];
        backwards[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            backwards[i] = backwards[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] *= backwards[i];
        }

        return result;
    }
}  
