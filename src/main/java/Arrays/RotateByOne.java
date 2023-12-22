package Arrays;

public class RotateByOne {

    public void rotate(int[] arr, int n) {
        if (n <= 1) return;
        int temp = arr[n - 1];
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] ^ temp ^ (temp = arr[i]);
        }
    }
}
