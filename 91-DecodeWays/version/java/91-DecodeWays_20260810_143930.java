// Last updated: 8/10/2026, 2:39:30 PM
1class Solution {
2    public int numDecodings(String s) {
3        if (s.charAt(0) == '0') {
4            return 0;
5        }
6        int n = s.length();
7        int[] dp = new int[n + 1];
8        dp[0] = dp[1] = 1;
9        for (int i = 2; i <= n; i++) {
10            int one = Character.getNumericValue(s.charAt(i - 1));
11            int two = Integer.parseInt(s.substring(i - 2, i));
12            if (1 <= one && one <= 9) {
13                dp[i] += dp[i - 1];
14            }
15            if (10 <= two && two <= 26) {
16                dp[i] += dp[i - 2];
17            }
18        }
19        return dp[n];        
20    }
21}