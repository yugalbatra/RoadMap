package Arrays;

public class MaximumProductSubArray {

    public int maxProduct(int[] nums) {
        int min = nums[0], max = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                max = max + min - (min = max);
            }
            max = Math.max(nums[i], nums[i] * max);
            min = Math.min(nums[i], nums[i] * min);
            ans = Math.max(max, ans);
        }
        return ans;
    }
}
