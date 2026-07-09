// Last updated: 7/9/2026, 9:15:34 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int map1[]=new int[256];
        int map2[]=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if((map1[ch1]==0)&&(map2[ch2]==0)){
                map1[ch1]=ch2;
                map2[ch2]=ch1;
            }
            else{
                if((map1[ch1]!=ch2) ||(map2[ch2]!=ch1)){
                    return false;
                }
            }
        }
        return true;
    }
}