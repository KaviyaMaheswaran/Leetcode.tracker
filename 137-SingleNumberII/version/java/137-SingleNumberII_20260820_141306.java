// Last updated: 8/20/2026, 2:13:06 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans = 0;
4        for (int i = 0; i < 32; i++) {
5            int count = 0;
6            for (int num : nums) {
7                if ((num & (1 << i)) != 0) {
8                    count++;
9                }
10            }
11            if (count % 3 != 0) {
12                ans = ans | (1 << i);
13            }
14        }
15        return ans;
16    }
17}