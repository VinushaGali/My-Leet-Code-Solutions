/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array. */

// The Program description is from Leet Code https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75 
// Below is my code.


class Solution {
    public void moveZeroes(int[] nums) {
        int numlen=nums.length;
        for(int i=0;i<numlen-1;i++){
            for(int j=i+1;j<numlen;j++){
            if((nums[i]==0)&&(nums[j]!=0)){
                nums[i]=nums[j];
                nums[j]=0;
                break;
            }
            }
        }
        for(int i=0;i<numlen;i++){
            System.out.print(nums[i]);
        }
    }
}
