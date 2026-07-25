class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        Arrays.sort(nums);

        if (nums[0] > 0) return outerList;

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = -(nums[j] + nums[k]);
                if (nums[i] < sum) {
                    j++;
                } else if (nums[i] > sum) {
                    k--;
                } else if (nums[i] == sum) {
                    List<Integer> innerList = List.of(nums[i], nums[j], nums[k]);
                    if (!outerList.contains(innerList)) {
                        outerList.add(innerList);
                    }
                    j++;
                    k--;
                }
            }
        }

        return outerList;
    }
}
