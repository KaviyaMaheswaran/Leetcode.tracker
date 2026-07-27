// Last updated: 7/27/2026, 2:32:15 PM
1import java.util.*;
2class Solution {
3    public int[] intersection(int[] nums1, int[] nums2) {
4        HashSet<Integer> set = new HashSet<>();
5        HashSet<Integer> result = new HashSet<>();
6        for (int num : nums1) {
7            set.add(num);
8        }
9        for (int num : nums2) {
10            if (set.contains(num)) {
11                result.add(num);
12            }
13        }
14        int[] ans = new int[result.size()];
15        int i = 0;
16        for (int num : result) {
17            ans[i++] = num;
18        }
19        return ans;
20    }
21}