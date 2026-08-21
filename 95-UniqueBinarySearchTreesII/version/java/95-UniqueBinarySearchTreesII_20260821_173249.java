// Last updated: 8/21/2026, 5:32:49 PM
1class Solution {
2    public boolean checkRecord(String s) {
3        int absent = 0;
4        int late = 0;
5        for (char c : s.toCharArray()) {
6            if (c == 'A') {
7                absent++;
8                late = 0;
9            } 
10            else if (c == 'L') {
11                late++;
12            } 
13            else {
14                late = 0;
15            }
16            if (absent >= 2 || late >= 3) {
17                return false;
18            }
19        }
20        return true;
21    }
22}