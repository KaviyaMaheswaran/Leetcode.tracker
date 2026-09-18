// Last updated: 9/18/2026, 10:58:53 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        for (int multiple = k; ; multiple += k) {
4            boolean found = false;
5            for (int i = 0; i < nums.length; i++) {
6                if (nums[i] == multiple) {
7                    found = true;
8                    break;
9                }
10            }
11            if (!found) {
12                return multiple;
13            }
14        }
15    }
16}