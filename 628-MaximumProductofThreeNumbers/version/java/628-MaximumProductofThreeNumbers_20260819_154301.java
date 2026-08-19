// Last updated: 8/19/2026, 3:43:01 PM
1import java.util.Arrays;
2
3class Solution {
4    public int maximumProduct(int[] nums) {
5        Arrays.sort(nums);
6        int n = nums.length;
7        int a = nums[0] * nums[1] * nums[n - 1];
8        int b = nums[n - 1] * nums[n - 2] * nums[n - 3];
9        return Math.max(a, b);
10    }
11}