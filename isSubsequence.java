/* Given two strings s and t, return true if s is a subsequence of t, or false otherwise. A subsequence of a string is a new string that is formed from the original string 
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not). */

/* This Problem description is from Leet Code. https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75. Below is my approach
to this program. */


class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        int k=0,count=0;
        for(int i=0;i<len1;i++){
            for(int j=k;j<len2;j++){
                if(s.charAt(i)==t.charAt(j)){
                    k=j+1;
                    count+=1;
                    break;
                }
            }
        }
        if(count==len1){
            return true;
        }
        else{
            return false;
        }

    }
}
