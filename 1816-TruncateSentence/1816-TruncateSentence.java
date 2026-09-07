// Last updated: 9/7/2026, 4:18:57 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String ans = "";
        for (int i = 0; i < k; i++) {
            ans += words[i];
            if (i != k - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}