// Last updated: 8/11/2026, 2:00:07 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while (left <= right) {
6            int mid = (left + right) / 2;
7            if (nums[mid] == target) {
8                return mid;
9            }
10            if (nums[left] <= nums[mid]) {
11                if (target >= nums[left] && target < nums[mid]) {
12                    right = mid - 1;
13                } else {
14                    left = mid + 1;
15                }
16            }
17            else {
18                if (target > nums[mid] && target <= nums[right]) {
19                    left = mid + 1;
20                } else {
21                    right = mid - 1;
22                }
23            }
24        }
25        return -1;
26    }
27}
28