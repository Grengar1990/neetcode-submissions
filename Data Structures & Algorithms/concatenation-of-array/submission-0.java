class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        int j = 0;
        while(j < 2 * n) {
            for(int i = 0; i < nums.length; i++) {
                ans[j + i] = nums[i];
            }
            j = j + n;
        }
        return ans;
    }
}