class Solution {
    public boolean isHappy(int n) {
         Set<Integer> nums = new HashSet<>();
        nums.add(n);
        int num=n;
        while(true)
        {
          int sum =0;
          while(num>0)
          {
              sum +=(num%10)*(num%10);
              num=num/10;
          }
          if(sum==1)
          return true;

          num=sum;
          //System.out.println(num);
          if(!nums.add(sum))
               return false;
    }}
}