// Last updated: 8/20/2026, 2:16:28 PM
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3        int left = 1;
4        int right = n;
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7            if (isBadVersion(mid)) {
8                right = mid;
9            } else {
10                left = mid + 1;
11            }
12        }
13        return left;
14    }
15}