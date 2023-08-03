class Solution {
    public int countDistinctIntegers(int[] nums) {
        
       int n = nums.length; 
       Set<Integer> set = new HashSet<>();
         int i =0;
         while(i<n)
         {
             set.add(nums[i]);

            if(nums[i]>9)
                {
                   int sum= 0, k =nums[i];
                   while(k>0)
                   {
                       sum = sum*10+k%10;
                       k=k/10;
                   }
                  set.add(sum);
                }
            
             i++;
         }

         return set.size();

    }
}