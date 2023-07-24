class Solution {
    public boolean stoneGame(int[] piles) {
        
        int a=0, b=0;
        int n = piles.length;
         for(int i=0;i<n/2;i++)
         {
           
           int min = piles[i];
           int max = piles[n-i-1];
          
              a+=Math.max(min,max);
              b+=Math.min(min,max);

         }


         return a>b;





    }
}