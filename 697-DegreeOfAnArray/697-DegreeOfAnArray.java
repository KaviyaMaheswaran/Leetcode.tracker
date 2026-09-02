// Last updated: 9/2/2026, 9:41:10 AM
class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000];
        int[] first = new int[50000];
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] == 0) {
                first[nums[i]] = i;
            }
            count[nums[i]]++;
        }
        int degree = 0;
        for (int num : nums) {
            degree = Math.max(degree, count[num]);
        }
        int answer = nums.length;
        for (int num : nums) {
            if (count[num] == degree) {
                int last = 0;
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == num) {
                        last = i;
                        break;
                    }
                }
                answer = Math.min(answer, last - first[num] + 1);
            }
        }
        return answer;
    }
}