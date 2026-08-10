// Last updated: 8/10/2026, 2:37:04 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        int m = num1.length();
4        int n = num2.length();
5        int[] res = new int[m + n];
6        for (int i = m - 1; i >= 0; i--) {
7            int d1 = num1.charAt(i) - '0';
8            for (int j = n - 1; j >= 0; j--) {
9                int d2 = num2.charAt(j) - '0';
10                int mul = d1 * d2;
11                int p1 = i + j;
12                int p2 = i + j + 1;
13                int sum = mul + res[p2];
14                res[p2] = sum % 10;
15                res[p1] += sum / 10;
16            }
17        }
18        StringBuilder sb = new StringBuilder();
19        for (int num : res) {
20            if (!(sb.length() == 0 && num == 0)) {
21                sb.append(num);
22            }
23        }
24        return sb.length() == 0 ? "0" : sb.toString();
25    }
26}