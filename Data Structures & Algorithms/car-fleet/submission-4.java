class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleetCount = 0;
        double maxTime = 0;
        int n = position.length;
        int[][] pair = new int[n][2];
        double[] time = new double[n];

        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> b[0] - a[0]);
        for (int i = 0; i < position.length; i++) {
            time[i] = ((double) target - pair[i][0]) / pair[i][1];
        }
        for (double t : time) {
            if (t > maxTime) {
                fleetCount++;
                maxTime = t;
            }
        }
        return fleetCount;
    }
}
