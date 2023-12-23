package Leetcode;

class TreeNode {
    int val;

    TreeNode left;

    TreeNode right;
    TreeNode() {
    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Six06 {

    String str = "";

    public String tree2str(TreeNode root) {
        if (root == null) {
            return str;
        }

        str += root.val;
        if (root.left == null && root.right == null) {
            return str;
        }

        str += "(";
        tree2str(root.left);
        str += ")";
        if (root.right == null) {
            return str;
        }

        str += "(";
        tree2str(root.right);
        str += ")";
        return str;
    }
}
