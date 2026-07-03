class Solution {
    public int getSum(int a, int b) {
        while ( a != 0) {
            int c = a ^ b;
            a = (a & b) << 1;
            b = c;
        }
        return b;
    }
}
