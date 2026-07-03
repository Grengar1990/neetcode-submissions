class Solution {
    public int getSum(int a, int b) {
        int c = a ^ b;
        a = (a & b) << 1;
        b = a + c;
        return b;
    }
}
