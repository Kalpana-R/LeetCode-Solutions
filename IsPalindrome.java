 public boolean isPalindrome(int x) {
      
      if(x<0)
      return false;
      int sum=0, a=x;
      while(x!=0)
      {
           sum =(sum*10)+(x%10);
           x=x/10;
      }
     if(sum==a)
     return true;
     else
     return false;




    }