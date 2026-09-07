// Last updated: 9/7/2026, 4:19:04 PM
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