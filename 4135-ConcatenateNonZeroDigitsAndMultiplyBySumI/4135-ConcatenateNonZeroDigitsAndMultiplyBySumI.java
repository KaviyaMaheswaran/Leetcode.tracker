// Last updated: 7/9/2026, 9:13:35 AM
class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        int sum=0;
        if(n==0){
            return n;
        }
        String s=String.valueOf(n);
        for(char ch:s.toCharArray()){
                int digit=ch-'0';
            if(digit!=0){
                x=x*10+digit;
                sum+=digit;
            }
        }
        return x*sum;
    }
}