// Last updated: 7/9/2026, 9:15:57 AM
class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = cleaned.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}