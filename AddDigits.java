class Solution {
    public int addDigits(int num) {

        String no = String.valueOf(num);
        int sum=Integer.valueOf(num);
        while(no.length()>1){
            sum=0;
        for(int i=0;i<no.length();i++)
        {
            sum+= no.charAt(i)-'0';
        }
         no =String.valueOf(sum);

        }

        return sum;
    }
}