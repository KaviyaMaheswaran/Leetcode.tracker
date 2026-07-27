// Last updated: 7/27/2026, 11:23:15 AM
1import java.util.HashMap;
2
3class Solution {
4    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        for (int i = 0; i < nums1.length; i++) {
7            for (int j = 0; j < nums2.length; j++) {
8                int sum = nums1[i] + nums2[j];
9                map.put(sum, map.getOrDefault(sum, 0) + 1);
10            }
11        }
12        int count = 0;
13        for (int i = 0; i < nums3.length; i++) {
14            for (int j = 0; j < nums4.length; j++) {
15                int target = -(nums3[i] + nums4[j]);
16                if (map.containsKey(target)) {
17                    count += map.get(target);
18                }
19            }
20        }
21        return count;
22    }
23}