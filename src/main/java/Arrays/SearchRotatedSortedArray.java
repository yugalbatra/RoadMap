package Arrays;

public class SearchRotatedSortedArray {

    public static int searchInRotatedSortedArray(int[] arr, int element) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == element) return mid;
            if (arr[start] <= arr[mid]) {
                if (arr[mid] > element && element >= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < element && element <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println();
        }
        return -1;
    }
}
