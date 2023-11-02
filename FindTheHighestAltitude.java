/* There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point. */

/* This Problem description is from Leet Code. https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75. Below is my approach
to this program. */

class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int al[]= new int[n+1];
        al[0]=0;
        int sum=0;
        int j=0;
        int high=0;
        for(int i=1;i<n+1;i++){
            al[i]=sum+gain[i-1];
            sum=al[i];
            if(al[i]>high){
                high=al[i];
            }
        }
        return high;
        
     }
}
