package Arrays;

import java.util.ArrayList;

public class CommonElements3SortedArrays {

    ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && A[i] == C[k]) {
                if (arrayList.size() == 0 || arrayList.get(arrayList.size() - 1) != A[i]) arrayList.add(A[i]);
                i++;
                j++;
                k++;
                continue;
            }
            if (A[i] < B[j] || A[i] < C[k]) i++;
            else if (B[j] < C[k] || B[j] < A[i]) j++;
            else if (C[k] < A[i] || C[k] < B[j]) k++;
        }
        return arrayList;
    }
}
