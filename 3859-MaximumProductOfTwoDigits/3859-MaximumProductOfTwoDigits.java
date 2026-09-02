// Last updated: 9/2/2026, 9:38:40 AM
class Solution {
    public int maxProduct(int n) {
        int max1 = 0, max2 = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
            n /= 10;
        }
        return max1 * max2; 
    }
}