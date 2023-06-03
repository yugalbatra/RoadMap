package Arrays;

public class Sort0s1s2s {

    public static void sort012(int arr[], int n) {
        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;
            else if (arr[i] == 1) ones++;
            else twos++;
        }
        int k = 0;
        while (zeros > 0) {
            arr[k++] = 0;
            zeros--;
        }
        while (ones > 0) {
            arr[k++] = 1;
            ones--;
        }
        while (twos > 0) {
            arr[k++] = 2;
            twos--;
        }
    }
}
