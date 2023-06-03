package Arrays;

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
}
