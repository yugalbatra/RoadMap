package Arrays;

public class MaxSubArraySum {

    long maxSubarraySum(int[] arr, int n) {
        long maxSum = arr[0], sum = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    /**
     * Used Kadane's Algorithm to solve this question.
     *
     * @param nums take input as array of integers.
     * @return return maxSubArraySum in integer.
     */
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
