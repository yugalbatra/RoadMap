package Arrays;

public class MinimumSizeSubArraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE, currentSum = 0, startIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            while (currentSum >= target) {
                minLen = Math.min(minLen, i - startIndex + 1);
                currentSum -= nums[startIndex++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
