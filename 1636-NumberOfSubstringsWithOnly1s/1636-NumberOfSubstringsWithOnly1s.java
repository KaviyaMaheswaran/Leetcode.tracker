// Last updated: 7/9/2026, 9:14:02 AM
class Solution {
    public int numSub(String s) {
        long count=0;
        long ans=0;
        long mod=1000000007;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                count=0;
            }
            ans=(ans+count)%mod;
        }
        return (int)ans;
    }
}