class Solution {
    public boolean isPalindrome(String s) {

      String b="";
      s= s.toLowerCase();
      for(int i=0;i<s.length();i++)
      {
         if((s.charAt(i)-0 >= 97 && s.charAt(i)-0<=122) || (s.charAt(i)-0>=48 && s.charAt(i)<=57)  )
            b= b+String.valueOf(s.charAt(i));
      }

    int i=0, n=b.length()-1;
      while(i<n)
      {
          if(b.charAt(i)==b.charAt(n))
          { i++;n--;}
        else
             return false;
      }

      return true;

   




        
    }
}