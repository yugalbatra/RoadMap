package BitManipulation;

import java.util.Arrays;

public class NonRepeatingNumber {

    public int[] singleNumber(int[] nums) {
        int[] nonRepeatingNumbers = new int[2];
        int k =0;
        for (int i = 0;i<nums.length;i++) {
            boolean unique = true;
            for (int j=0;j<nums.length;j++) {
                if (i != j && (nums[i] ^ nums[j]) == 0) {
                    unique = false;
                    break;
                }
            }
            if (unique) nonRepeatingNumbers[k++] = nums[i];
        }
        Arrays.sort(nonRepeatingNumbers);
        return nonRepeatingNumbers;
    }
}
