// Last updated: 9/19/2026, 5:16:21 PM
import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        int sum = 0;
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        if (k % 2 == 1) {
            sum = sum - (2 * min);
        }
        return sum;
    }
}