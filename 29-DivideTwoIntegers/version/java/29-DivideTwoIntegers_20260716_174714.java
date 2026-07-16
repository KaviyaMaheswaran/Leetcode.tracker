// Last updated: 7/16/2026, 5:47:14 PM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        if (dividend == Integer.MIN_VALUE && divisor == -1) {
4            return Integer.MAX_VALUE;
5        }
6        return dividend / divisor;
7    }
8}