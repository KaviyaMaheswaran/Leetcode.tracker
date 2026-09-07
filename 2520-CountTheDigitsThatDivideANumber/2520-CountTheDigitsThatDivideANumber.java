// Last updated: 9/7/2026, 4:18:34 PM
class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (original % digit == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}