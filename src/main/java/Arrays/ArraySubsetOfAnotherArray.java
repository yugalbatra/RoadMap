package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraySubsetOfAnotherArray {

    public String isSubset(long[] a1, long[] a2, long n, long m) {
        Map<Long, Integer> hashMap = new HashMap<>();
        for (long i : a1) hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        for (long i : a2) {
            if (!hashMap.containsKey(i) || hashMap.get(i) == 0) return "No";
            hashMap.put(i, hashMap.get(i) - 1);
        }
        return "Yes";
    }
}
