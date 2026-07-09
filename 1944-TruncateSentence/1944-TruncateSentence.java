// Last updated: 7/9/2026, 9:13:51 AM
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