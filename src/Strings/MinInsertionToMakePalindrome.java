package Strings;

public class MinInsertionToMakePalindrome {

    public int minInsertions(final String s) {
        if(s.length()==1) return 0;
        if(s.length() == 2) {
            if (s.charAt(0) != s.charAt(1)) return 1;
            else return 0;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return Math.min(minInsertions(s.substring(0,s.length()-2)),
                    minInsertions(s.substring(1,s.length()-1))) + 1;
        }
        else return minInsertions(s.substring(1,s.length()-2));

    }
}
