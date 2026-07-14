// Last updated: 7/14/2026, 11:21:26 AM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        int n = nums.length;
6        for (int i = 0; i < n - 3; i++) {
7            if (i > 0 && nums[i] == nums[i - 1])
8                continue;
9            for (int j = i + 1; j < n - 2; j++) {
10                if (j > i + 1 && nums[j] == nums[j - 1])
11                    continue;
12                int left = j + 1;
13                int right = n - 1;
14                while (left < right) {
15                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
16                    if (sum == target) {
17                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
18                        left++;
19                        right--;
20                        while (left < right && nums[left] == nums[left - 1])
21                            left++;
22
23                        while (left < right && nums[right] == nums[right + 1])
24                            right--;
25
26                    } else if (sum < target) {
27                        left++;
28                    } else {
29                        right--;
30                    }
31                }
32            }
33        }
34        return ans;
35    }
36}