package SearchingAndSorting;

import java.util.ArrayList;
import java.util.List;

public class CommonInSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        List<Integer> elements = getCommonElements(arr1, arr2, arr3);
        System.out.println(elements);
    }

    public static List<Integer> getCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i = 0, j = 0, k = 0; i < arr1.length && j < arr2.length && k < arr3.length; ) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
                continue;
            }
            if (arr1[i] < arr2[j] || arr1[i] < arr3[k]) {
                i++;
            } else if (arr2[j] < arr3[k] || arr2[j] < arr1[i]) {
                j++;
            } else if (arr3[k] < arr1[i] || arr3[k] < arr2[j]) {
                k++;
            }
        }
        return commonElements;
    }
}
