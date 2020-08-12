package leetcode;

/**
 * https://leetcode.com/problems/rotate-array/
 * Level: Easy
 */
class Solution {
    public void rotate(int[] nums, int k) {
        // Make sure that k is less than the length of the arrawy
        k = k % nums.length;

        // First, Reverse all the numbers
        reverse(nums, 0, nums.length-1);
        System.out.println("first: "+nums);        
        
        // Second, reverse firsk k numbers
        reverse(nums, 0, k-1);
        System.out.println("second: "+nums);        
        
        // Finally, revese last n-k numbers
        reverse(nums, k, nums.length-1);        
        System.out.println("third: "+nums);        
    }

    private void reverse(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start+=1;
            end-=1;
        }
    }

}