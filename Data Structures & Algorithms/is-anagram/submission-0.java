
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        // sort 
        char [] sChars = s.toCharArray();
        char [] tChars = t.toCharArray();

        java.util.Arrays.sort(sChars);
        java.util.Arrays.sort(tChars);

        String newS = new String(sChars);
        String newT = new String(tChars);


        // equal 

        if (newS.equals(newT)){
            return true;
        }
        else{
            return false;
        }
         
    }
}
