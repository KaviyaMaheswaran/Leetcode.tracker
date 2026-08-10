// Last updated: 8/10/2026, 1:46:50 PM
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || numRows >= s.length()) {
4            return s;
5        }
6        StringBuilder[] rows = new StringBuilder[numRows];
7
8        for (int i = 0; i < numRows; i++) {
9            rows[i] = new StringBuilder();
10        }
11        int row = 0;
12        boolean down = true;
13        for (int i = 0; i < s.length(); i++) {
14            rows[row].append(s.charAt(i));
15            if (row == 0) {
16                down = true;
17            } 
18            else if (row == numRows - 1) {
19                down = false;
20            }
21            if (down) {
22                row++;
23            } 
24            else {
25                row--;
26            }
27        }
28        StringBuilder result = new StringBuilder();
29        for (int i = 0; i < numRows; i++) {
30            result.append(rows[i]);
31        }
32        return result.toString();
33    }
34}