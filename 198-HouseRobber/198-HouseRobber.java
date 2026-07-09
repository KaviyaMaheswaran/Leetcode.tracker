// Last updated: 7/9/2026, 9:15:37 AM
class Solution {
    public int rob(int[] nums) {
       int rob=0;
       int norob=0;
       for(int i=0;i<nums.length;i++){
        int newrob=norob+nums[i];
        int newnorob=Math.max(rob,norob);
        rob=newrob;
        norob=newnorob;

       }
       return Math.max(rob,norob);
    }
}