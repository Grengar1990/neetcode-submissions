class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> h = new HashSet<>();
        for (int i: nums) {
            if (h.contains(i)) {
                return true;
            } else {
                h.add(i);
            }
        }
        return false;
    }
}