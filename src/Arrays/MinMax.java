package Arrays;

class Pair {
    int min, max;

    Pair() {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }
}

public class MinMax {
    public static Pair minMax(int[] arr) {
        Pair minMax = new Pair();
        for (int i : arr) {
            if (i > minMax.max) {
                minMax.max = i;
            }
            if (i < minMax.min) {
                minMax.min = i;
            }
        }
        return minMax;
    }
}
