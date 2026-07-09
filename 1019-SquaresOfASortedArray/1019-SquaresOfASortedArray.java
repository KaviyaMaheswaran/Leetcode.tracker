// Last updated: 7/9/2026, 9:14:19 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int arr[]= new int[n];
        int left=0,right=n-1;

        for(int i=n-1;i>=0;i--)
        {
            
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            arr[i]=nums[left]*nums[left++];
            else
            arr[i]=nums[right]*nums[right--];
        }
        return arr;
    }
}