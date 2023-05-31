/* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, 
and an integer extraCandies, denoting the number of extra candies that you have. Return a boolean array result of length n, where result[i] is true if, 
after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.Note that multiple kids can
have the greatest number of candies. */

/* This Program Description is from Leet Code https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75.
Below is my approach for this Program. */



class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l=candies.length;
        Boolean[] result1= new Boolean[l];
        for(int i=0;i<l;i++){
            int y=0;
            int x=candies[i]+extraCandies;
            for(int j=0;j<l;j++){
                if(x>=candies[j]){
                    y+=1;
                }
            }
            if(y==l){
                result1[i]=true;
            }
            else{
                result1[i]=false;            }
        }
        List<Boolean> result = new ArrayList<>(Arrays.asList(result1));
        return result;
    }
}
