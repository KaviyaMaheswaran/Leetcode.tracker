// Last updated: 7/25/2026, 4:11:27 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0, max2 = 0;
4        while (n > 0) {
5            int digit = n % 10;
6            if (digit > max1) {
7                max2 = max1;
8                max1 = digit;
9            } else if (digit > max2) {
10                max2 = digit;
11            }
12            n /= 10;
13        }
14        return max1 * max2; 
15    }
16}