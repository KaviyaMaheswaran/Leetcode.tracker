// Last updated: 7/9/2026, 9:16:13 AM
class Solution {
    public int removeDuplicates(int[] nums) {
     int k=0;
     for(int i=0;i<nums.length;i++)
     {
       if(k<2||nums[i]!=nums[k-2])
       {
        nums[k]=nums[i];
        k++;
       }
     } 
     return k; 
    }
}