package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {

    int getPairsCount(int[] arr, int n, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(k - arr[i])) {
                count += hashMap.get(k - arr[i]);
            }
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
