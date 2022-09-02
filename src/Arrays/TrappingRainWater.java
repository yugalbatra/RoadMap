package Arrays;

public class TrappingRainWater {
    public int trap(int[] height) {
        int waterTrapped = 0;
        int leftMax = 0, rightMax = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] < height[j]) {
                if (height[i] > leftMax) {
                    leftMax = height[i];
                } else {
                    waterTrapped += leftMax - height[i];
                }
                i++;
            } else {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                } else {
                    waterTrapped += rightMax - height[j];
                }
                j--;
            }
        }
        return waterTrapped;
    }
}
