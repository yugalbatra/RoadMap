package Leetcode;

public class One913 {
    public int maxProductDifference(final int[] nums) {
        return maxProduct(nums) - minProduct(nums);
    }

    private int minProduct(final int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = min;
        for (int num : nums) {
            if (num < min) {
                secondMin = min;
                min = num;
            }
            else if (num < secondMin) {
                secondMin = num;
            }
        }

        return min * secondMin;
    }

    private int maxProduct(final int[] nums) {
        int max = Integer.MIN_VALUE, secondMax = max;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            }
            else if (num > secondMax) {
                secondMax = num;
            }
        }

        return max * secondMax;
    }
}
