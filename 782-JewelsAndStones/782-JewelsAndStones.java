// Last updated: 9/2/2026, 9:41:02 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            if (jewels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}