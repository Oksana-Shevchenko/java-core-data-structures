package com.javacore;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstTraversal {
    private final BinaryTree tree;

    public BreadthFirstTraversal(BinaryTree tree) {
        this.tree = tree;
    }

    public void traverseLevelOrder(NodeVisitor visitor) {
        traverseLevelOrder(tree.getRoot(), visitor);
    }

    public static void traverseLevelOrder(Node root, NodeVisitor visitor) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            visitor.visit(node);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
