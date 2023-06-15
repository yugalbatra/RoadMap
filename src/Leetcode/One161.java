package Leetcode;

import BinaryTrees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class One161 {

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int maxSum = Integer.MIN_VALUE;
        int currentLevel = 1;
        int maxLevel = 1;
        int currentSum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            if (node == null) {
                queue.add(null);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    maxLevel = currentLevel;
                }
                currentSum = 0;
                currentLevel++;
                queue.poll();
                if (queue.peek() == null) break;
                continue;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            currentSum += node.val;
            queue.poll();
        }
        return maxLevel;
    }
}
