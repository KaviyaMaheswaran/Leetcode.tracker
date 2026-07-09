// Last updated: 7/9/2026, 9:14:46 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int size = s.length();
        
        String sFold = s.substring(1, size) + s.substring(0, size-1);
        
        return sFold.contains(s);
        
    }
}