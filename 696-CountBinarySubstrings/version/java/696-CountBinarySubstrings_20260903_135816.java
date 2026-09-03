// Last updated: 9/3/2026, 1:58:16 PM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int prev = 0;
4        int curr = 1;
5        int ans = 0;
6        for (int i = 1; i < s.length(); i++) {
7            if (s.charAt(i) == s.charAt(i - 1)) {
8                curr++;
9            } else {
10                ans += Math.min(prev, curr);
11                prev = curr;
12                curr = 1;
13            }
14        }
15        ans += Math.min(prev, curr);
16        return ans;
17    }
18}