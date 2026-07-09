// Last updated: 7/9/2026, 9:14:54 AM
class Solution {
    public int countSegments(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        if(s.equals("")) return 0;
        return s.split(" ").length;
    }
}