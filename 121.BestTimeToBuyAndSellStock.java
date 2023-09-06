class Solution {
    public int maxProfit(int[] prices) {
        
    int max=0, pointer = prices[0];

    for(int i =1;i<prices.length;i++)
    {
         if(prices[i]<pointer)
         {
             pointer=prices[i];
           //  max=0;
         }

         else
         {
             max = Math.max(max, prices[i]-pointer);
         }

    }

return max;

    }
}