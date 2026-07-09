// Last updated: 7/9/2026, 9:15:40 AM
class Solution {
    public int trailingZeroes(int n) {
    int count=0;
    while(n>0){
        n=n/5;
        count+=n;
    } 
    return count;   
    }
}