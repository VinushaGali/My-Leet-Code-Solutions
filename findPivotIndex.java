/* Given an array of integers nums, calculate the pivot index of this array.The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the 
sum of all the numbers strictly to the index's right. If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. 
This also applies to the right edge of the array. Return the leftmost pivot index. If no such index exists, return -1. */

/* This Problem description is from Leet Code. https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75. Below is my approach
to this program. */




class Solution {
    public int pivotIndex(int[] nums) {
          int len=nums.length;
          int left=0, right=0;
          for(int i=0;i<len;i++){
              for(int j=i-1;j>=0;j--){
                  left+=nums[j];
              }
              for(int k=i+1;k<len;k++){
                  right+=nums[k];
              }
              if(left==right){
                  return i;
              }
              left=0;
              right=0;
          }
          return -1;
    }
}
