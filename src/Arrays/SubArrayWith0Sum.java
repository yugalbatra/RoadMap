package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum {

    static boolean findsum(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
}
