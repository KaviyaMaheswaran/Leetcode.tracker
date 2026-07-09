// Last updated: 7/9/2026, 9:15:20 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int m=total-sum;
        return m;
    }
}