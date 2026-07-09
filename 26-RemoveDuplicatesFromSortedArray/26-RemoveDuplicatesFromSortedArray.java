// Last updated: 7/9/2026, 9:16:41 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
                
            }
        }
        return ++j;
    }
}