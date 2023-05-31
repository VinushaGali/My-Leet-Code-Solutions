/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, 
append the additional letters onto the end of the merged string. Return the merged string. */

// The Program description is from Leeet Code. https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75. Below is my approach for this program


class Solution {
    public String mergeAlternately(String word1, String word2) {
       int len1=word1.length();
       int len2=word2.length();
       int flen=len1+len2;
       int slen=len1*2;
       int tlen=len2*2;
       int i=0,j=0;
       char merged[]=new char[flen];
       if(len1==len2){
           while(i<flen){
               while(j<len1){
                   merged[i]=word1.charAt(j);
                   merged[i+1]=word2.charAt(j);
                   j+=1;
                   break;
               }
               i+=2;
           }
       }
       else if(len1<len2){
           while(i<slen){
               while(j<len1){
                   merged[i]=word1.charAt(j);
                   merged[i+1]=word2.charAt(j);
                   j+=1;
                   break;
               }
               i+=2;
           }
           int k=i;
           while(k<flen){
               while(j<len2){
                   merged[k]=word2.charAt(j);
                   j+=1;
                   break;
               }
               k+=1;
           }
       }
       else{
           while(i<tlen){
               while(j<len2){
                   merged[i]=word1.charAt(j);
                   merged[i+1]=word2.charAt(j);
                   j+=1;
                   break;
               }
               i+=2;
           }
           int k=i;
           while(k<flen){
               while(j<len1){
                   merged[k]=word1.charAt(j);
                   j+=1;
                   break;
               }
               k+=1;
           }
       }
       String m=String.valueOf(merged);
       return m; 
    }
}
