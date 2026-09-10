// Last updated: 9/10/2026, 5:31:06 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        int ans = 0;
4        for (int i = 0; i < nums.length; i++) {
5            int count1 = 0;
6            int count2 = 0;
7            for (int j = 0; j < nums.length; j++) {
8                if (nums[j] == nums[i]) {
9                    count1++;
10                }
11                if (nums[j] == nums[i] + 1) {
12                    count2++;
13                }
14            }
15            if (count1 > 0 && count2 > 0) {
16                ans = Math.max(ans, count1 + count2);
17            }
18        }
19        return ans;
20    }
21}