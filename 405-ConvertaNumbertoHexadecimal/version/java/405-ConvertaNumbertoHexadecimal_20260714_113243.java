// Last updated: 7/14/2026, 11:32:43 AM
1class Solution {
2    public String toHex(int num) {
3        if (num == 0) {
4            return "0";
5        }
6        char[] hex = {
7            '0','1','2','3','4','5','6','7',
8            '8','9','a','b','c','d','e','f'
9        };
10        StringBuilder ans = new StringBuilder();
11        while (num != 0) {
12            ans.append(hex[num & 15]);
13            num = num >>> 4;
14        }
15        return ans.reverse().toString();
16    }
17}