package Strings;

public class RemoveConsecutiveDuplicates {

    public String removeConsecutiveCharacter(String S) {
        if (S.length() == 0) return S;
        char last = S.charAt(0);
        String newString = "" + last;
        for (int i = 1;i< S.length();i++) {
            if (S.charAt(i)!=last) newString += S.charAt(i);
            last = S.charAt(i);
        }
        return newString;
    }
}
