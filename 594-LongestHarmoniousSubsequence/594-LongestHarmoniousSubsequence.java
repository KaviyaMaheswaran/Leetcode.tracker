// Last updated: 9/10/2026, 2:57:17 PM
class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count1++;
                }
                if (nums[j] == nums[i] + 1) {
                    count2++;
                }
            }
            if (count1 > 0 && count2 > 0) {
                ans = Math.max(ans, count1 + count2);
            }
        }
        return ans;
    }
}