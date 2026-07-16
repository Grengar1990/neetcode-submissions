class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        Deque<Double> timeStack = new ArrayDeque<>();
        for (int i = 0; i < position.length; i++ ) {
            map.put(position[i], speed[i]);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            double time = ((double) target - entry.getKey()) / entry.getValue();
            if (!timeStack.isEmpty() && time <= timeStack.peek())
                continue;
            timeStack.push(time);
        }
        return timeStack.size();
    }
}
