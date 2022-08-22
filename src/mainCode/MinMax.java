package mainCode;

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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            }
            if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }
        return minMax;
    }
}
