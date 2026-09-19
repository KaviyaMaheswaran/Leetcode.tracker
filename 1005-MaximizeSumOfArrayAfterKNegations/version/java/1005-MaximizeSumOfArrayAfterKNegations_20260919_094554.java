// Last updated: 9/19/2026, 9:45:54 AM
1import java.util.Arrays;
2
3class Solution {
4    public int largestSumAfterKNegations(int[] nums, int k) {
5        Arrays.sort(nums);
6        for (int i = 0; i < nums.length && k > 0; i++) {
7            if (nums[i] < 0) {
8                nums[i] = -nums[i];
9                k--;
10            }
11        }
12        int sum = 0;
13        int min = nums[0];
14        for (int i = 0; i < nums.length; i++) {
15            sum += nums[i];
16            if (nums[i] < min) {
17                min = nums[i];
18            }
19        }
20        if (k % 2 == 1) {
21            sum = sum - (2 * min);
22        }
23        return sum;
24    }
25}