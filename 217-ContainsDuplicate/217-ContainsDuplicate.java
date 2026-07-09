// Last updated: 7/9/2026, 9:15:29 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
      boolean res = false;
      Set<Integer> set = new HashSet<>();
      for(int i = 0; i < nums.length; i++){
         if(set.contains(nums[i])){
            return true;
         } else {
            set.add(nums[i]);
         }
       
      }
      return false;
    }
}