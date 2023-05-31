/* You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise. */

/* This Problem description is from Leet Code. https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&id=leetcode-75. Below is my approach
to this program. */





class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flen=flowerbed.length;
        int x=0,m=n,i=0,j=0;
        while(n!=0){
            if(flen>1){
            if((flowerbed[0]==0)&&(flowerbed[1]==0)){
                flowerbed[0]=1;
                x+=1;
            }
            else if((flowerbed[flen-1]==0)&&(flowerbed[flen-2]==0)){
                flowerbed[flen-1]=1;
                x+=1;
            }
            else{
            for(i=0;i<flen-2;i++){
                j=i+1;
                if((flowerbed[i]!=1)&&(flowerbed[j+1]!=1)){
                    if(flowerbed[j]!=1){
                        flowerbed[j]=1;
                        x+=1;
                        break;
                    }
                }
            }
            }
            }
            else{
                if(flowerbed[0]==0){
                    flowerbed[0]=1;
                    x+=1;
                }
            }
            n--;
        }
        if(x==m){
            return true;
        }
        else{
            return false;
        }
    }
}
