// Last updated: 8/22/2026, 4:00:29 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp = n;
4        int sum = 0;
5        int product = 1;
6        while (temp > 0) {
7            int digit = temp % 10;
8            sum += digit;
9            product *= digit;
10            temp /= 10;
11        }
12        int total = sum + product;
13        return n % total == 0;
14    }
15}