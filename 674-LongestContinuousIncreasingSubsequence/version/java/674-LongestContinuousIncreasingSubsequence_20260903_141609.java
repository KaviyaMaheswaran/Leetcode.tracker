// Last updated: 9/3/2026, 2:16:09 PM
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        int count = 1;
4        int max = 1;
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] > nums[i - 1]) {
7                count++;
8            } else {
9                count = 1;
10            }
11            max = Math.max(max, count);
12        }
13        return max;
14    }
15}