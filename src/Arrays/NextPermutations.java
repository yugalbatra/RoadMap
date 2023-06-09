package Arrays;

import java.util.Arrays;

public class NextPermutations {

    public static void reverse(int[] arr, int k) {
        for (int i = k, j = arr.length - 1; i < j; i++, j--) {
            arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
        }
    }

    public void nextPermutation(int[] nums) {
        int k = nums.length - 2;
        int last = nums[nums.length - 1];
        while (k >= 0 && nums[k] >= last) {
            last = nums[k--];
        }
        if (k != -1) {
            for (int i = nums.length - 1; i > k; i--) {
                if (nums[i] > nums[k]) {
                    nums[i] = nums[i] ^ nums[k] ^ (nums[k] = nums[i]);
                    break;
                }
            }
        }
        reverse(nums, k + 1);
    }
}
