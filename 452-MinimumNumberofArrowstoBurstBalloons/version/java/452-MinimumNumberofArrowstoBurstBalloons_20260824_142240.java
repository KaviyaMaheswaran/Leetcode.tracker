// Last updated: 8/24/2026, 2:22:40 PM
1import java.util.*;
2class Solution {
3    public int findMinArrowShots(int[][] points) {
4        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
5        int arrows = 1;
6        int end = points[0][1];
7        for (int i = 1; i < points.length; i++) {
8            if (points[i][0] > end) {
9                arrows++;
10                end = points[i][1];
11            }
12        }
13        return arrows;
14    }
15}