// Last updated: 8/17/2026, 2:58:28 PM
1class Solution {
2    public List<List<Integer>> largeGroupPositions(String s) {
3        List<List<Integer>> result = new ArrayList<>();
4        int start = 0;
5        for (int i = 1; i <= s.length(); i++) {
6            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
7                if (i - start >= 3) {
8                    result.add(Arrays.asList(start, i - 1));
9                }
10                start = i;
11            }
12        }
13        return result;
14    }
15}