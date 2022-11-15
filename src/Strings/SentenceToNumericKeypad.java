package Strings;

public class SentenceToNumericKeypad {

    public static void main(String[] args) {
        System.out.println(keypadConversion("yugalbatra"));
    }

    static String[] numpad = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "xyz"};

    public static String getConversion(char ch) {
        if (ch == ' ') return "0";
        String conversion = "";
        for (int i = 0; i < numpad.length; i++) {
            if (numpad[i].contains(ch + "")) {
                for (int j=0;j<numpad[i].length();j++){
                    conversion += i+1;
                    if (numpad[i].charAt(j) == ch) {
                        return conversion;
                    }
                }
            }
        }
        return conversion;
    }

    public static String keypadConversion(String str) {
        String keypadConversion = "";
        for (char ch: str.toCharArray()) {
            keypadConversion += getConversion(ch);
        }
        return keypadConversion;
    }
}
