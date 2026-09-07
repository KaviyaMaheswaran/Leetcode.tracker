// Last updated: 9/7/2026, 4:18:03 PM
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