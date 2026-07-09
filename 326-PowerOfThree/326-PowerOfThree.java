// Last updated: 7/9/2026, 9:15:13 AM
class Solution {
    public boolean isPowerOfThree(int n) {
       for(int i=0;i<=31;i++){
           if(Math.pow(3,i)==n){
            return true;
           }
       }
       return false;
    }
}