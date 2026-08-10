// Last updated: 8/10/2026, 1:44:45 PM
1class Solution {
2    public String intToRoman(int num) {
3        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
4        String[] symbols = {
5            "M", "CM", "D", "CD", "C", "XC", "L",
6            "XL", "X", "IX", "V", "IV", "I"
7        };
8        String result = "";
9        for (int i = 0; i < values.length; i++) {
10            while (num >= values[i]) {
11                result += symbols[i];
12                num -= values[i];
13            }
14        }
15        return result;
16    }
17}