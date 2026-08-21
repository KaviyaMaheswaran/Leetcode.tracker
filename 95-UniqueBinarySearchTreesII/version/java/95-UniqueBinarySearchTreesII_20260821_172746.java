// Last updated: 8/21/2026, 5:27:46 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        int[] count = new int[1001];
4        for (int num : nums1) {
5            count[num]++;
6        }
7        int[] result = new int[Math.min(nums1.length, nums2.length)];
8        int index = 0;
9        for (int num : nums2) {
10            if (count[num] > 0) {
11                result[index++] = num;
12                count[num]--;
13            }
14        }
15        int[] answer = new int[index];
16        for (int i = 0; i < index; i++) {
17            answer[i] = result[i];
18        }
19        return answer;
20    }
21}