package Arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int minimumDifference(int[] arr, int packets) {
        if (packets > arr.length) return -1;
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - packets; i++) {
            int diff = arr[packets - 1 + i] - arr[i];
            if (diff < minDiff) minDiff = diff;
        }
        return minDiff;
    }
}
