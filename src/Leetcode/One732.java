package Leetcode;

public class One732 {

    public int largestAltitude(int[] gains) {
        int maxHeight = 0;
        int currentHeight = 0;
        for (int gain : gains) {
            currentHeight += gain;
            maxHeight = Math.max(maxHeight, currentHeight);
        }
        return maxHeight;
    }
}
