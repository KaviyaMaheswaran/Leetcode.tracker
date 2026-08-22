// Last updated: 8/22/2026, 3:53:54 PM
1class Solution {
2    public int findShortestSubArray(int[] nums) {
3        int[] count = new int[50000];
4        int[] first = new int[50000];
5        for (int i = 0; i < nums.length; i++) {
6            if (count[nums[i]] == 0) {
7                first[nums[i]] = i;
8            }
9            count[nums[i]]++;
10        }
11        int degree = 0;
12        for (int num : nums) {
13            degree = Math.max(degree, count[num]);
14        }
15        int answer = nums.length;
16        for (int num : nums) {
17            if (count[num] == degree) {
18                int last = 0;
19                for (int i = nums.length - 1; i >= 0; i--) {
20                    if (nums[i] == num) {
21                        last = i;
22                        break;
23                    }
24                }
25                answer = Math.min(answer, last - first[num] + 1);
26            }
27        }
28        return answer;
29    }
30}