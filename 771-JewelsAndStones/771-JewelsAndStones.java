// Last updated: 9/7/2026, 4:20:19 PM
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