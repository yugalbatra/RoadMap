package Leetcode;

public class One318 {

    private String convertNumericToBinary(int num) {
        StringBuilder numInBinary = new StringBuilder();
        while (num > 0) {
            numInBinary.insert(0, num % 2);
            num /= 2;
        }
        System.out.println(numInBinary.toString());
        return numInBinary.toString();
    }

    public int minFlips(int a, int b, int c) {
        int flipCount = 0;
        String aInBinary = convertNumericToBinary(a);
        String bInBinary = convertNumericToBinary(b);
        String cInBinary = convertNumericToBinary(c);
        int size = Math.max(cInBinary.length(), Math.max(aInBinary.length(), bInBinary.length()));


        for (int i = 0; i < size; i++) {
            int aAtI = 0, bAtI = 0, cAtI = 0;
            if (aInBinary.length()>i) aAtI = Character.getNumericValue(aInBinary.charAt(aInBinary.length()-i-1));
            if (bInBinary.length()>i) bAtI = Character.getNumericValue(bInBinary.charAt(bInBinary.length()-i-1));
            if (cInBinary.length()>i) cAtI = Character.getNumericValue(cInBinary.charAt(cInBinary.length()-i-1));
            if ((aAtI | bAtI) != cAtI) {
                if (aAtI == 1 && bAtI == 1) flipCount += 2;
                else flipCount++;
            }
        }
        return flipCount;
    }
}
