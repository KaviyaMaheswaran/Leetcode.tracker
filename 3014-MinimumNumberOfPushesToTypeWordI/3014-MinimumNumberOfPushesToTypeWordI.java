// Last updated: 9/7/2026, 4:18:20 PM
class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(i/8)+1;
        }
        return ans;
    }
}