class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int current = nums[0];
        for (int num : nums) {
            if (num < current) current = num;
            set.add(num);
        }


        int maxSequense = 1;
        for (int numSet: set) {
            int count = 1;
            while(set.contains(current + 1)) {
                current++;
                count++;
            }

            current = numSet;
            maxSequense = Math.max(maxSequense, count);
        }

        return maxSequense;
    }
}
