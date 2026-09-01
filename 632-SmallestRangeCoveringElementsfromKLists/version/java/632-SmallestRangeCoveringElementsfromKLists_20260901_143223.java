// Last updated: 9/1/2026, 2:32:23 PM
1class Solution {
2    public int[] smallestRange(List<List<Integer>> nums) {
3        PriorityQueue<int[]> pq = new PriorityQueue<>(
4            (a, b) -> Integer.compare(a[0], b[0])
5        );
6        int max = Integer.MIN_VALUE;
7        for (int i = 0; i < nums.size(); i++) {
8            int value = nums.get(i).get(0);
9
10            pq.offer(new int[]{value, i, 0});
11            max = Math.max(max, value);
12        }
13        int start = 0;
14        int end = Integer.MAX_VALUE;
15        while (pq.size() == nums.size()) {
16            int[] current = pq.poll();
17            int min = current[0];
18            int list = current[1];
19            int index = current[2];
20            if (max - min < end - start) {
21                start = min;
22                end = max;
23            }
24            if (index + 1 < nums.get(list).size()) {
25                int next = nums.get(list).get(index + 1);
26                pq.offer(new int[]{next, list, index + 1});
27                max = Math.max(max, next);
28            } else {
29                break;
30            }
31        }
32        return new int[]{start, end};
33    }
34}