// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
// The Pogram Description is from Leet Code https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75.
// Below is my approach
 


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int alen= arr.length;
        int count1=0;
        List<Integer> a= new ArrayList<Integer>();
        List<Integer> c= new ArrayList<Integer>();
        for(int i=0;i<alen;i++){
            int count=0;
            if(!(a.contains(arr[i]))){
            for(int j=0;j<alen;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            a.add(arr[i]);
            c.add(count);
            }
        }
        for(int i=0;i<c.size();i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(i)==c.get(j)){
                    count1+=1;
                }
            }
        }
        if(count1==0){
            return true;
        }
        else{
            return false;
        }
    }
}
