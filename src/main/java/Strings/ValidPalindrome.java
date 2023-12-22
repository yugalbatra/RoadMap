package Strings;

public class ValidPalindrome {

    private boolean isValid(char ch) {
        return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char chAti = s.charAt(i);
            char chAtj = s.charAt(j);
            boolean validI = isValid(chAti);
            boolean validJ = isValid(chAtj);
            if (validI && validJ) {
                if (chAti != chAtj) return false;
                i++;
                j--;
            }
            if (!validI) i++;
            if (!validJ) j--;
        }
        return true;
    }
}
