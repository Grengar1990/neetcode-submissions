class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int k = 0;

        while (l <= r) {
            int mid = (l + r) >>> 1;
            int hours = 0;
            for (int p : piles) {
                hours += (int) Math.ceil((double) p / mid);
            }
            if (hours <= h) {
                k = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return k;
    }
}
