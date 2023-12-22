package Arrays;

public class CountInversions {

    public static long inversionCount(long[] arr, long N) {
        long inversionsCount = 0;
        for (int i = 0; i < N - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                    arr[i] = arr[i] ^ arr[smallestIndex] ^ (arr[smallestIndex] = arr[i]);
                    inversionsCount++;
                }
            }
        }
        return inversionsCount;
    }

//    public static long inversionCountByMergeSort(long[] arr, long N) {
//        if (arr.length == 1) return 0;
//        int m = arr.length / 2;
//        long[] arr1 = new long[m];
//        System.arraycopy(arr, 0, arr1, 0, m);
//        long[] arr2 = new long[arr.length - m];
//        System.arraycopy(arr, m, arr2, 0, arr.length - m);
//        inversionCountByMergeSort(arr1, arr1.length);
//        inversionCountByMergeSort(arr2, arr2.length);
//        return mergeTwoSortedArrays(arr, arr1, arr2);
//    }

//    private static long mergeTwoSortedArrays(long[] arr, long[] arr1, long[] arr2) {
//        int i = 0, j = 0, k = 0;
//        long inversionCount = 0;
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] > arr2[j]) {
//                inversionCount++;
//                arr[k++] = arr1[i++];
//            } else {
//                arr[k++] = arr2[j++];
//            }
//        }
//        while ()
//    }

    static long inversionCount2(long arr[], long n) {
        int l = 0, r = (int) (n - 1);
        return mergeSort(arr, l, r);
    }

    static long merge(long arr[], int l, int m, int r) {
        long cnt = 0;
        int i = l, j = m + 1, ci = 0;
        long temp[] = new long[r - l + 1];
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[ci++] = arr[i++];
            } else {
                temp[ci++] = arr[j++];
                cnt += (m - i + 1); // Increment count for inversions
            }
        }
        while (i <= m) {
            temp[ci++] = arr[i++];
        }
        while (j <= r) {
            temp[ci++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[l + k] = temp[k];
        }
        return cnt;
    }

    static long mergeSort(long arr[], int l, int r) {
        long cnt = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            cnt += mergeSort(arr, l, m);
            cnt += mergeSort(arr, m + 1, r);
            cnt += merge(arr, l, m, r);
        }
        return cnt;
    }


}
