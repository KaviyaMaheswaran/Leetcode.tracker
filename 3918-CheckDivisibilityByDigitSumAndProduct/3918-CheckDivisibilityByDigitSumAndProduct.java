// Last updated: 9/2/2026, 9:38:44 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        int total = sum + product;
        return n % total == 0;
    }
}