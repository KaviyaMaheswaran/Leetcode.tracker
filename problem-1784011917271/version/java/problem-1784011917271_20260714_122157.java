// Last updated: 7/14/2026, 12:21:57 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int count = 0;
4        for (int i = 0; i < stones.length(); i++) {
5            char ch = stones.charAt(i);
6            if (jewels.indexOf(ch) != -1) {
7                count++;
8            }
9        }
10        return count;
11    }
12}