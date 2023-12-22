package BinaryTrees;

public class SubTreeOfAnother {

    public boolean isIdentical(TreeNode firstTree, TreeNode secondTree) {
        if (firstTree == null && secondTree == null) return true;
        if (firstTree == null || secondTree == null) return false;
        if (firstTree.val != secondTree.val) return false;
        return isIdentical(firstTree.left,secondTree.left) && isIdentical(firstTree.right,secondTree.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot!=null && root == null) return false;
        if (isIdentical(root,subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
