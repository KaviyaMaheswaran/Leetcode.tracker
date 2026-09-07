// Last updated: 9/7/2026, 4:21:35 PM
class Solution {
    public int strongPasswordChecker(String password) {
        int n = password.length();
        boolean small = false;
        boolean capital = false;
        boolean digit = false;
        for (char c : password.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                small = true;
            else if (c >= 'A' && c <= 'Z')
                capital = true;
            else if (c >= '0' && c <= '9')
                digit = true;
        }
        int missing = 0;
        if (!small) missing++;
        if (!capital) missing++;
        if (!digit) missing++;
        int replace = 0;
        int mod0 = 0;
        int mod1 = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && password.charAt(i) == password.charAt(j)) {
                j++;
            }
            int len = j - i;
            if (len >= 3) {
                replace += len / 3;
                if (len % 3 == 0)
                    mod0++;
                else if (len % 3 == 1)
                    mod1++;
            }
            i = j;
        }
        if (n < 6) {
            return Math.max(6 - n, missing);
        }
        if (n <= 20) {
            return Math.max(missing, replace);
        }
        int delete = n - 20;
        int d = Math.min(delete, mod0);
        replace -= d;
        delete -= d;
        d = Math.min(delete, mod1 * 2);
        replace -= d / 2;
        delete -= d;
        replace -= delete / 3;
        return (n - 20) + Math.max(missing, replace);
    }
}