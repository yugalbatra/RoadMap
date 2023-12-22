package SearchingAndSorting;

import java.util.Arrays;

public class CountingSort {

    public int[] countingSort(int[] arr) {
        int[] count = new int[10];
        for (int i : arr) {
            count[i]++;
        }
        for (int i = 0, sum = 0; i < count.length; i++) {
            sum += count[i];
            count[i] = sum;
        }
        for (int i = 0, last = 0; i < count.length; i++) {
            count[i] = last;
            last = count[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
