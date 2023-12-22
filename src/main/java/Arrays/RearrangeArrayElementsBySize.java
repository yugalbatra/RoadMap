package Arrays;

public class RearrangeArrayElementsBySize {

    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int positiveIndex = 0, negativeIndex = 1;
        for (int num : nums) {
            if (num >= 0) {
                arr[positiveIndex] = num;
                positiveIndex += 2;
            } else {
                arr[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return arr;
    }


    // Not working
    public int[] rearrangeArrayWithoutSpace(int[] nums) {
        int positiveIndex = 0, negativeIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && i != positiveIndex) {
                nums[positiveIndex] = nums[positiveIndex] ^ nums[i] ^ (nums[i] = nums[positiveIndex]);
                positiveIndex += 2;
                if (nums[i] >= 0) i--;
            } else if (i != negativeIndex) {
                nums[negativeIndex] = nums[negativeIndex] ^ nums[i] ^ (nums[i] = nums[negativeIndex]);
                negativeIndex += 2;
                if (nums[i] < 0) i--;
            }
        }
        return nums;
    }
}
