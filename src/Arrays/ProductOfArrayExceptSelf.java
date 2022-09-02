package Arrays;

public class ProductOfArrayExceptSelf {

    // 1, 2, 3, 4
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}
