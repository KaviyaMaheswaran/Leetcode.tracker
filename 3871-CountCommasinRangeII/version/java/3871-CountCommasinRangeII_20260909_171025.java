// Last updated: 9/9/2026, 5:10:25 PM
1class Solution {
2    public long countCommas(long n) {
3        long ans = 0;
4        long x = 1000;
5        while (x <= n) {
6            ans += n - x + 1;
7            x *= 1000;
8        }
9        return ans;
10    }
11}