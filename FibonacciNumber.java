class Solution {
    public int fib(int n) {

        int num1=0, num2=1, sum=0,count=n;
         while(count>=0)
         { 
             count--;
             sum +=num1;
             num1=num2;
             num2=sum;
         }
        
        return sum;
    }
}