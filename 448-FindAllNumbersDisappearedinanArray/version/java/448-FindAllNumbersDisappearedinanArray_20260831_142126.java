// Last updated: 8/31/2026, 2:21:26 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        int n = nums.length;
4        boolean[] seen = new boolean[n + 1];
5        List<Integer> result = new ArrayList<>();
6        for (int num : nums) {
7            seen[num] = true;
8        }
9        for (int i = 1; i <= n; i++) {
10            if (!seen[i]) {
11                result.add(i);
12            }
13        }
14        return result;
15    }
16}