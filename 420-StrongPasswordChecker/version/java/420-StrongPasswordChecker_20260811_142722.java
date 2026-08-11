// Last updated: 8/11/2026, 2:27:22 PM
1class Solution {
2    public int strongPasswordChecker(String password) {
3        int n = password.length();
4        boolean small = false;
5        boolean capital = false;
6        boolean digit = false;
7        for (char c : password.toCharArray()) {
8            if (c >= 'a' && c <= 'z')
9                small = true;
10            else if (c >= 'A' && c <= 'Z')
11                capital = true;
12            else if (c >= '0' && c <= '9')
13                digit = true;
14        }
15        int missing = 0;
16        if (!small) missing++;
17        if (!capital) missing++;
18        if (!digit) missing++;
19        int replace = 0;
20        int mod0 = 0;
21        int mod1 = 0;
22        for (int i = 0; i < n; ) {
23            int j = i;
24            while (j < n && password.charAt(i) == password.charAt(j)) {
25                j++;
26            }
27            int len = j - i;
28            if (len >= 3) {
29                replace += len / 3;
30                if (len % 3 == 0)
31                    mod0++;
32                else if (len % 3 == 1)
33                    mod1++;
34            }
35            i = j;
36        }
37        if (n < 6) {
38            return Math.max(6 - n, missing);
39        }
40        if (n <= 20) {
41            return Math.max(missing, replace);
42        }
43        int delete = n - 20;
44        int d = Math.min(delete, mod0);
45        replace -= d;
46        delete -= d;
47        d = Math.min(delete, mod1 * 2);
48        replace -= d / 2;
49        delete -= d;
50        replace -= delete / 3;
51        return (n - 20) + Math.max(missing, replace);
52    }
53}