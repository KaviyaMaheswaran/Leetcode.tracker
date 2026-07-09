// Last updated: 7/9/2026, 9:15:50 AM
class Solution {
    public String reverseWords(String s) {
     String word[]=s.trim().split("\\s+");
     String res="";
     for(int i=word.length-1;i>=0;i--){
        res+=word[i];
     if(i!=0){
        res+=" ";
     }
     }
     return res;
    }
}