class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (setNums.contains(nums[i])) {
                return true;
            }
                setNums.add(nums[i]);
            }
            return false;
    }
}
