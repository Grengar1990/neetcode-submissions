class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preffix = new int[nums.length + 1];
        preffix[0] = 1;
        for (int i = 1; i < preffix.length; i++) {
            preffix[i] = preffix[i - 1] * nums[i -1];
        }
        int[] suffix = new int[preffix.length];
        suffix[suffix.length - 1] = 1;
        for (int i = suffix.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
            
        }
        int[] result = new int[preffix.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = preffix[i] * suffix[i + 1];
        }

        return result;
    }
}  
