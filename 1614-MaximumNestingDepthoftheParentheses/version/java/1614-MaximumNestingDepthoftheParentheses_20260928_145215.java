// Last updated: 9/28/2026, 2:52:15 PM
1class Solution {
2    public int maxDepth(String s) {
3        int depth = 0;
4        int max = 0;
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == '(') {
7                depth++;
8                if (depth > max) {
9                    max = depth;
10                }
11            } 
12            else if (s.charAt(i) == ')') {
13                depth--;
14            }
15        }
16        return max;
17    }
18}