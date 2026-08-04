class Solution {
    public int search(int[] nums, int target) {
        
        if (nums == null || nums.length == 0) {
            return -1;
        } else if (nums.length == 1 && target == nums[0]) {
            return 0;
        }

        int l =0;
        int r = nums.length - 1;

        while (l < r) {
            if (nums[l] == target) {
                return l;
            } else if (nums[r] == target) {
                return r;
            }
            int m = (l + r) >>> 1;
            if (nums[m] == target) {
                return m;
            } else if (nums[l] < nums[m]) {
                if (target > nums[l] && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (nums[m] < nums[r]) {
                if (target > nums[m] && target < nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else return -1;
        }

        return -1;
    }
}
