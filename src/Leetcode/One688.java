package Leetcode;

public class One688 {
    public int numberOfMatches(int n) {
        int noOfTournaments = 0;
        for (int i = n; i > 1; ) {
            noOfTournaments += i / 2;
            i = i % 2 != 0 ? i/2 +1 : i/2;
        }

        return noOfTournaments;
    }
}
