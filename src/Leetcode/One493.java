package Leetcode;

public class One493 {

    public int longestSubarray(int[] nums) {
        int max = 0, prev = 0, curr = 0;
        for (int num : nums) {
            if (num == 1) curr++;
            else {
                max = Math.max(curr + prev, max);
                prev = curr;
                curr = 0;
            }
        }
        max = Math.max(curr + prev, max);
        if (curr == nums.length) return curr - 1;
        return max;
    }
}
