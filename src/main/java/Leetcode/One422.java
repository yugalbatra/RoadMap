package Leetcode;

public class One422 {
    public int maxScore(String str) {
        final var lengthOfStr = str.length();
        var max = 0;
        for (int i = 1; i < lengthOfStr; i++) {
            final var leftZero = countZeroes(str.substring(0, i));
            final var rightOne = str.substring(i).length() - countZeroes(str.substring(i));
            max = Math.max(max, leftZero + rightOne);
        }

        return max;
    }

    private int countZeroes(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        if (Integer.parseInt(str.substring(0, 1)) == 0) {
            return 1 + countZeroes(str.substring(1));
        }

        return countZeroes(str.substring(1));
    }
}
