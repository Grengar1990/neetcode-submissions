class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] lists = new List[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
     
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            lists[pair.getValue()].add(pair.getKey());
        }
        
        int count = 0;
        int[] result = new int[k];
        for (int i = lists.length - 1; count < k; i--) {
            for (int el : lists[i]) {
                result[count++] = el;
            }
        }
        return result;
    }
}
