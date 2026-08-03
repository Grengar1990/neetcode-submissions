class Solution {
    public int findMin(int[] nums) {
        
        if (nums == null || nums.length == 0)
            return 0;

        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else if (nums[l] > nums[m]) {
                r = m;
            } else if (nums[l] <= nums[m]) {
                return nums[l];
            }
        }       

        return nums[0];
    }
}
