package SearchingAndSorting;

import java.util.Arrays;

public class TwoArraySumGreaterThanK {

    public static void main(String[] args) {
        System.out.println(pairSumGreaterOrEqualToK(new int[]{1, 3, 2}, new int[]{8, 9, 7}, 10));
    }

    public static boolean pairSumGreaterOrEqualToK(int[] arr1, int[] arr2, int k) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[arr2.length - i - 1] < k) {
                return false;
            }
        }
        return true;
    }
}
