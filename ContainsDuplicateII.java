class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

       // int i=-1;
       HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++)
        {

          if(map.containsKey(nums[i]) && i-map.get(nums[i]) <=k )
          {
             System.out.print("i="+i);
                          return true;

          }      
          map.put(nums[i],i);

  
        }
return false;