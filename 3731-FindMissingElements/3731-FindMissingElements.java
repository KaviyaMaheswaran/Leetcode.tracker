// Last updated: 9/19/2026, 5:15:40 PM
import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int num = min; num <= max; num++) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans.add(num);
            }
        }
        return ans;
    }
}