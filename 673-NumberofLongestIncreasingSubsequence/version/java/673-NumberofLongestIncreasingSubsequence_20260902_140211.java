// Last updated: 9/2/2026, 2:02:11 PM
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        int n = nums.length;
4        int[] len = new int[n];
5        int[] count = new int[n];
6        for (int i = 0; i < n; i++) {
7            len[i] = 1;
8            count[i] = 1;
9        }
10        int maxLen = 1;
11        int answer = 0;
12        for (int i = 0; i < n; i++) {
13            for (int j = 0; j < i; j++) {
14                if (nums[j] < nums[i]) {
15                    if (len[j] + 1 > len[i]) {
16                        len[i] = len[j] + 1;
17                        count[i] = count[j];
18                    }
19                    else if (len[j] + 1 == len[i]) {
20                        count[i] += count[j];
21                    }
22                }
23            }
24            maxLen = Math.max(maxLen, len[i]);
25        }
26        for (int i = 0; i < n; i++) {
27            if (len[i] == maxLen) {
28                answer += count[i];
29            }
30        }
31        return answer;
32    }
33}