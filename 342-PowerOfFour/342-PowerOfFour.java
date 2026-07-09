// Last updated: 7/9/2026, 9:15:12 AM
class Solution {
    public boolean isPowerOfFour(int n) {
      for(int i=0;i<=31;i++){
        if(Math.pow(4,i)==n){
            return true;
        }
      }  
      return false;
    }
}