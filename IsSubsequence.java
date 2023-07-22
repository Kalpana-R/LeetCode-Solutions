class Solution {
    public boolean isSubsequence(String s, String t) {
      int n = t.length();

        for(int i=0;i<s.length();i++)
        {
           if(!t.contains(String.valueOf(s.charAt(i))))
           {
             return false;
           }

             t=t.substring(t.indexOf(s.charAt(i))+1);
        }
        return true;
    }
}