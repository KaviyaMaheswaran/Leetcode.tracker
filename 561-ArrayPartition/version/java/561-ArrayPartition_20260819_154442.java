// Last updated: 8/19/2026, 3:44:42 PM
1import java.util.Arrays;
2class Solution {
3    public int arrayPairSum(int[] nums) {
4        Arrays.sort(nums);
5        int sum = 0;
6        for (int i = 0; i < nums.length; i += 2) {
7            sum += nums[i];
8        }
9        return sum;
10    }
11}