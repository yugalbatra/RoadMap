package Arrays;

import java.util.Arrays;

public class TripletSumInArray {

    public static boolean twoSum(int[] arr, int i, int k) {
        for (int j = arr.length - 1; i < j; ) {
            if (arr[i] + arr[j] == k) return true;
            else if (arr[i] + arr[j] > k) j--;
            else i++;
        }
        return false;
    }

    public static boolean find3Numbers(int[] A, int n, int X) {
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            if (twoSum(A, i + 1, X - A[i])) return true;
        }
        return false;
    }
}
