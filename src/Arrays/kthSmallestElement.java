package Arrays;

public class kthSmallestElement {

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[]{73, 188, 894, 915, 940, 616, 900, 548}, 0, 7, 7));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int pivotElement = arr[l];
        int pivot = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivotElement) {
                pivot++;
            }
        }
        if (pivot + 1 == k) return pivotElement;
        arr[pivot] = arr[pivot] ^ arr[l] ^ (arr[l] = arr[pivot]);
        int i = l, j = pivot + 1;
        while (i < pivot && j <= r) {
            if (arr[i] > pivotElement && arr[j] < pivotElement) {
                arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
                i++;
                j++;
            } else if (arr[i] < pivotElement) {
                i++;
            } else j++;
        }
        if (pivot + 1 < k) {
            return kthSmallest(arr, pivot + 1, r, k);
        } else {
            return kthSmallest(arr, l, pivot - 1, k);
        }
    }
}
