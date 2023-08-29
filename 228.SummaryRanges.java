class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<String>();
        int i=0;   
        for(;i<nums.length;)
        {
           String cur = String.valueOf(nums[i]);
              boolean range=false;
           
           while(i+1 < nums.length && nums[i+1] == nums[i]+1)
           {
                range=true;
                i++;
           }
           if(range)
           {
               cur=cur+"->"+String.valueOf(nums[i]);
           }
           result.add(cur);
           i++;
        }
        return result;       
    }
}