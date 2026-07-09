// Last updated: 7/9/2026, 9:15:24 AM
class Solution {
    public boolean isAnagram(String s, String t) {
       char n1[]=s.toCharArray();
       char n2[]=t.toCharArray();
       Arrays.sort(n1);
       Arrays.sort(n2);
       if(n1.length!=n2.length){
        return false;
       }
       for(int i=0;i<n1.length;i++){
       if(n1[i]!=n2[i])
       {
        return false;
       }
     }
       return true;

    }
}