// Last updated: 9/7/2026, 4:21:56 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        for (int num : nums1) {
            count[num]++;
        }
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int num : nums2) {
            if (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }
        int[] answer = new int[index];
        for (int i = 0; i < index; i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}