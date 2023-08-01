class Solution {
    public int getLucky(String s, int k) {
   StringBuilder ans= new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
       ans.append( 1+ s.charAt(i)-'a');
    
    }
    int sum=0;

  while(k>0){
      sum=0;
     for(int i=0;i<ans.length();i++)
     {
        sum+= ans.charAt(i)-'0';
            
     }k--;
     ans =new StringBuilder(String.valueOf(sum));
  }

   return sum;
    }
}