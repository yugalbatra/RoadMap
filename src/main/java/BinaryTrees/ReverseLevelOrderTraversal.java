package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class ReverseLevelOrderTraversal {

    public ArrayList<Integer> reverseLevelOrder(Node node) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node newNode = queue.poll();
            if (newNode.right!=null)queue.add(newNode.right);
            if (newNode.left!=null) queue.add(newNode.left);
            arrayList.add(0,newNode.data);
        }
        return arrayList;
    }
}
