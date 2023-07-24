public boolean isStrictlyPalindromic(int n) {
    
    int i=n-2;
    while(i>=2)
    {
        int m=n;
        String sum ="";
          while(m>0)
          {
            sum = sum+String.valueOf(m%i);
            m=m/i;
          }
        
        int e=sum.length()-1,s=0;

        while(s<e){
            
                if(sum.charAt(s)!=sum.charAt(e))
                {
                   return false;
                }
             else
               {
               s++;e--;
              }
    }
        i--;

    }
    

       return true; 
    }