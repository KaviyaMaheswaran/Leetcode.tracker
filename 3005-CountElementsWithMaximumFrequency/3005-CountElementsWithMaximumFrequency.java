// Last updated: 9/7/2026, 4:18:23 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int []hash = new int[101];
        int max = 0;
        int ans =1;
        for(int num:nums){
            hash[num] += 1;
        }
        for(int h=1;h <= 100;h++){
            if(hash[h] == max){
                ans = ans + hash[h];
            }
            else if( hash[h] > max){
                max = hash[h];
                ans = max;
            }
            else{
                continue;
            }
        }
        return ans;
    }
}