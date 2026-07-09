// Last updated: 7/9/2026, 9:16:59 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (str.indexOf(ch) != -1) {
                    break;
                }
                str += ch;
                maxLen = Math.max(maxLen, str.length());
            }
        }
        return maxLen;
    }
}