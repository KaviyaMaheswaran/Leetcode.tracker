// Last updated: 9/10/2026, 5:32:32 PM
1import java.util.*;
2
3class Solution {
4    public int triangleNumber(int[] nums) {
5        Arrays.sort(nums);
6        int count = 0;
7        for (int i = 0; i < nums.length - 2; i++) {
8            for (int j = i + 1; j < nums.length - 1; j++) {
9                for (int k = j + 1; k < nums.length; k++) {
10                    if (nums[i] + nums[j] > nums[k]) {
11                        count++;
12                    }
13                }
14            }
15        }
16        return count;
17    }
18}