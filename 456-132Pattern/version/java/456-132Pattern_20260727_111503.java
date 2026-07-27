// Last updated: 7/27/2026, 11:15:03 AM
1import java.util.*;
2class Solution {
3    public boolean find132pattern(int[] nums) {
4        Stack<Integer> stack = new Stack<>();
5        int third = Integer.MIN_VALUE;
6        for (int i = nums.length - 1; i >= 0; i--) {
7            if (nums[i] < third) {
8                return true;
9            }
10            while (!stack.isEmpty() && nums[i] > stack.peek()) {
11                third = stack.pop();
12            }
13            stack.push(nums[i]);
14        }
15        return false;
16    }
17}