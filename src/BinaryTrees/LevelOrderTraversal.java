package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> subList = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode top = queue.poll();
            if (top == null) {
                list.add(subList);
                subList = new ArrayList<>();
                if (queue.peek() == null) break;
                queue.add(null);
                continue;
            }
            if (top.left != null) queue.add(top.left);
            if (top.right != null) queue.add(top.right);
            subList.add(top.val);
        }
        return list;
    }
}
