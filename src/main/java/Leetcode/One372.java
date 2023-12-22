package Leetcode;

import BinaryTrees.TreeNode;

public class One372 {

    private int longestZigZag(TreeNode root, int height, boolean left) {
        if (root == null) return height;
        int ans1 = 0, ans2 = 0;
        if (left) {
            ans1 = Math.max(longestZigZag(root.left, height + 1, false), longestZigZag(root.right, 1, true));
        } else {
            ans2 = Math.max(longestZigZag(root.right, height + 1, true), longestZigZag(root.left, 1, false));
        }
        return Math.max(ans1, ans2);
    }

    public int longestZigZag(TreeNode root) {
        return Math.max(longestZigZag(root, 0, true), longestZigZag(root, 0, false));
    }
}
