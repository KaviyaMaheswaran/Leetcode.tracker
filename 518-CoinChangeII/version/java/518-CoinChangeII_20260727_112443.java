// Last updated: 7/27/2026, 11:24:43 AM
1class Solution {
2    public int change(int amount, int[] coins) {
3        int[] dp = new int[amount + 1];
4        dp[0] = 1;
5        for (int coin : coins) {
6            for (int j = coin; j <= amount; j++) {
7                dp[j] = dp[j] + dp[j - coin];
8            }
9        }
10        return dp[amount];
11    }
12}