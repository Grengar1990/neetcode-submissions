class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] preffix = new int[n];
        preffix[0] = 1;
        for (int i = 1; i < n; i++) {
            preffix[i] = preffix[i - 1] * nums[i - 1];
        }    

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            preffix[i] *= suffix;
            suffix *= nums[i];
        }

        return preffix;
    }
}  
