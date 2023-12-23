package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {

    public List<Integer> majorityElement(int[] nums) {
        return majorityElement(nums, 3);
    }

    public List<Integer> majorityElement(int[] arr, int k) {
        int x = arr.length / k;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) > x) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
