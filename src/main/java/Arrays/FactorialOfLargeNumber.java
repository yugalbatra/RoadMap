package Arrays;

import java.util.ArrayList;

public class FactorialOfLargeNumber {

    private static void multiply(ArrayList<Integer> arrayList, int x) {
        int carry = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int num = arrayList.get(i) * x + carry;
            arrayList.set(i, num % 10);
            carry = num / 10;
        }

        while (carry != 0) {
            arrayList.add(0, carry % 10);
            carry /= 10;
        }
    }

    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(N);
        for (int i = N - 1; i > 1; i--) {
            multiply(arrayList, i);
        }
        return arrayList;
    }
}
