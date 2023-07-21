class Solution {
    public int lengthOfLastWord(String s) {

        String[] StrArr = s.split(" ");
        int n = StrArr.length;
        
        return StrArr[n-1].length();
        
    }
}