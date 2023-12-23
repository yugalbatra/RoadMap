package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void sort1stElement(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i] ^ arr[i + 1] ^ (arr[i + 1] = arr[i]);
            } else return;
        }
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int i = 0, j = 0;
        while (i < arr1.length) {
            if (arr1[i] > arr2[j]) {
                arr1[i] = arr1[i] ^ arr2[j] ^ (arr2[j] = arr1[i]);
            }
            i++;
            sort1stElement(arr2);
        }
    }

    public static void merge2(long arr1[], long arr2[], int n, int m) {
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;

            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
