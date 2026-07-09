// Last updated: 7/9/2026, 9:15:30 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
      Arrays.sort(nums);
      return nums[nums.length-k];
    }
}