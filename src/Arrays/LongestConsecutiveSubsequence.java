package Arrays;

import java.util.HashMap;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        System.out.println(findLongestConseqSubseq(new int[]{2, 6, 1, 9, 4, 5, 3}, 7));
    }

    public static int findLongestConseqSubseq(int[] arr, int N) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max = 0;
        for (int i : arr) {
            if (hashMap.containsKey(i)) continue;
            hashMap.put(i, hashMap.getOrDefault(i - 1, 0) + 1 + hashMap.getOrDefault(i + 1, 0));
            if (hashMap.containsKey(i - 1)) {
                int size = hashMap.get(i - 1);
                for (int j = 1; j <= size; j++) hashMap.put(i - j, hashMap.get(i));
            }
            if (hashMap.containsKey(i + 1)) {
                int size = hashMap.get(i + 1);
                for (int j = 1; j <= size; j++) hashMap.put(i + j, hashMap.get(i));
            }
            max = Math.max(hashMap.get(i), max);
        }
        return max;
    }
}
