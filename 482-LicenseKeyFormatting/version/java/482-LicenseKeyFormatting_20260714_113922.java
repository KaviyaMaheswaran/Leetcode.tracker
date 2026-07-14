// Last updated: 7/14/2026, 11:39:22 AM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder ans = new StringBuilder();
4        int count = 0;
5        for (int i = s.length() - 1; i >= 0; i--) {
6            char ch = s.charAt(i);
7            if (ch == '-') {
8                continue;
9            }
10            if (count == k) {
11                ans.append('-');
12                count = 0;
13            }
14            ans.append(Character.toUpperCase(ch));
15            count++;
16        }
17        return ans.reverse().toString();
18    }
19}