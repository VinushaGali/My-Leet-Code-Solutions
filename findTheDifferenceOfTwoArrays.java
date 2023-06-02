/* Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order. */

// The Program Description is from Leet Code. https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75. Below is my approach for this Program.
 

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        List<Integer> arr1=new ArrayList<Integer>();
        List<Integer> arr2=new ArrayList<Integer>();
        int m=0;
        for(int i=0;i<len1;i++){
            int k=0;
            for(int j=0;j<len2;j++){
                if(nums1[i]!=nums2[j]){
                    k+=1;
                }
            }
            if((k==len2)&&(!arr1.contains(nums1[i]))){
                arr1.add(nums1[i]);
                m+=1;
            }
            
        }
        m=0;
        for(int i=0;i<len2;i++){
            int k=0;
            for(int j=0;j<len1;j++){
                if(nums2[i]!=nums1[j]){
                    k+=1;
                }
            }
            if((k==len1)&&(!arr2.contains(nums2[i]))){
                arr2.add(nums2[i]);
                m+=1;
            }
            
        }
        List<List<Integer>> b = new ArrayList<List<Integer>>();
        b.add(arr1);
        b.add(arr2);
        return b;
    }
}
