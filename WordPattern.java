class Solution {
    public boolean wordPattern(String pattern, String s) {

       
        int n = pattern.length();
        String[] arr = s.split(" ");

             if(n!=arr.length)
             return false;
        HashMap<String, Character> map = new HashMap<>();
    
    for(int i=0;i<n;i++)
        {

        
          if((map.containsKey(arr[i]) && map.get(arr[i])!=pattern.charAt(i)) || !map.containsKey(arr[i]) && map.containsValue(pattern.charAt(i)))
      return false;
 
        map.put(arr[i], pattern.charAt(i));
        }      




        
        return true;
    }
}