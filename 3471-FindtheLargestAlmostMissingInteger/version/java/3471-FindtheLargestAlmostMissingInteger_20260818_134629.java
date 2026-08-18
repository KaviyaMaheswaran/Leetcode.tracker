// Last updated: 8/18/2026, 1:46:29 PM
1class Solution {
2    public int maxDistance(int[] colors) {
3        int n = colors.length;
4        int max = 0;
5        for (int i = 0; i < n; i++) {
6            if (colors[i] != colors[0]) {
7                max = Math.max(max, i);
8            }
9            if (colors[i] != colors[n - 1]) {
10                max = Math.max(max, n - 1 - i);
11            }
12        }
13        return max;
14    }
15}