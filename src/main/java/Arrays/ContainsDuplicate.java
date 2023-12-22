package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Used set to find duplicates.
     * @param nums input as array of integers.
     * @return returned a boolean value true if contains duplicates false else.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}
