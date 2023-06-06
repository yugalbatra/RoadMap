package Arrays;

import java.util.LinkedList;
import java.util.Queue;

public class NegativeFirstPositiveLast {
    public static void negativePositiveSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = arr.length - 1; j >= i; j--) {
                    if (j == i) return;
                    if (arr[j] < 0) {
                        arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
                        break;
                    }
                }
            }
        }
    }

    public void segregateElements(int[] arr, int n) {
        Queue<Integer> negativeQueue = new LinkedList<>();
        Queue<Integer> positiveQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i]<0) negativeQueue.offer(arr[i]);
            else positiveQueue.offer(arr[i]);
        }
        int k =0;
        while (!positiveQueue.isEmpty()) arr[k++] = positiveQueue.poll();
        while (!negativeQueue.isEmpty()) arr[k++] = negativeQueue.poll();
    }
}
