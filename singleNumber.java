/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space. */

// The Program Description is from Leet Code https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=leetcode-75.
// Below is My Approach.

 


class Solution {
    public int singleNumber(int[] nums) {
        int numlen=nums.length;
        int number=0;
        for(int i=0;i<numlen;i++){
            int count=0;
            for(int j=0;j<numlen;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
            if(count==1){
                number=nums[i];
                break;
            }
        }
        return number;
    }
}
