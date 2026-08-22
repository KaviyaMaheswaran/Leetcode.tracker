// Last updated: 8/22/2026, 3:55:46 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        if (s.length() != goal.length()) {
4            return false;
5        }
6        String temp = s + s;
7        return temp.contains(goal);
8    }
9}