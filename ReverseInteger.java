class Solution {
    public int reverse(int x) {
        long sol=0; int sign=0;
        if(x<0)
        {
            sign=1;
            x =x*(-1);
        }
        while(x!=0)
        {
         int mod = x%10;
         sol = sol*10+mod;
         x=x/10;
        }
     
            if(sol <Math.pow(-2,31) || sol > Math.pow(2,31))
            return 0;

        if(sign==1)
        {
            sol = sol*(-1);
        }
        return (int)sol;

    }
}