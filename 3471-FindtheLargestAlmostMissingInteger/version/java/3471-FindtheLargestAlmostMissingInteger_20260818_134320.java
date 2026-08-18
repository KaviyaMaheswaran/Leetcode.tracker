// Last updated: 8/18/2026, 1:43:20 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int[] count = new int[51];
4        for (int i = 0; i <= nums.length - k; i++) {
5            boolean[] seen = new boolean[51];
6            for (int j = i; j < i + k; j++) {
7                seen[nums[j]] = true;
8            }
9            for (int x = 0; x <= 50; x++) {
10                if (seen[x]) {
11                    count[x]++;
12                }
13            }
14        }
15        for (int x = 50; x >= 0; x--) {
16            if (count[x] == 1) {
17                return x;
18            }
19        }
20        return -1;
21    }
22}