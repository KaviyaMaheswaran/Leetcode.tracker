// Last updated: 9/21/2026, 2:22:23 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6        while (left < right) {
7            int width = right - left;
8            int h = Math.min(height[left], height[right]);
9            maxArea = Math.max(maxArea, width * h);
10            if (height[left] < height[right]) {
11                left++;
12            } else {
13                right--;
14            }
15        }
16        return maxArea;
17    }
18}