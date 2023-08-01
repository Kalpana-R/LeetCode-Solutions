class Solution {
    public int climbStairs(int n) {

        int count=1, num1=1, num2=1,num3,sum=0;

        while(count<=n)
        {
                 sum = sum+num1;
                 num1=num2;
                 num2=sum;
                 count++;
        }

        return sum;
        
    }
}