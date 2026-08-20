// Last updated: 8/20/2026, 2:19:11 PM
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        int left = 1;
4        int right = n;
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            int result = guess(mid);
8            if (result == 0) {
9                return mid;
10            }
11            else if (result == -1) {
12                right = mid - 1;
13            }
14            else {
15                left = mid + 1;
16            }
17        }
18        return -1;
19    }
20}