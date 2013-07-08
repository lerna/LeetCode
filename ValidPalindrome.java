public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( s == null ) {
            return false;
        }
        int i = 0;
        int j = s.length()-1;
        
        while(j > 0 && i < j) {
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while(j > 0 && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) {
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
            }
            j--;
            i++;
        }
               
        return true;
    }
}
