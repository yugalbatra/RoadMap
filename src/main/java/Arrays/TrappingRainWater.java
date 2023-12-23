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

    public static long trappingWater(int[] height, int n) {
        long waterTrapped = 0;
        int[] maxFromLeft = new int[height.length], maxFromRight = new int[height.length];
        maxFromLeft[0] = height[0];
        maxFromRight[height.length - 1] = height[height.length - 1];
        for (int i = 1; i < height.length; i++) {
            maxFromLeft[i] = Math.max(maxFromLeft[i - 1], height[i]);
            maxFromRight[height.length - i - 1] = Math.max(maxFromRight[height.length - i], height[height.length - i - 1]);
        }
        for (int i =0;i<height.length;i++) {
            int currentWater = Math.min(maxFromLeft[i],maxFromRight[i]) - height[i];
            if (currentWater>0) waterTrapped+=currentWater;
        }
        return waterTrapped;
    }

    public static void main(String[] args) {
        System.out.println(trappingWater(new int[]{7,4,0,10},4));
    }
}
