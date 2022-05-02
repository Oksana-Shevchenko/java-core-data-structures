package com.javacore;

import java.util.ArrayDeque;
import java.util.Deque;

public class DepthFirstTraversalIterative implements DepthFirstTraversal {

    private final BinaryTree tree;

    public DepthFirstTraversalIterative(BinaryTree tree) {
        this.tree = tree;
    }

    @Override
    public void traversePreOrder(NodeVisitor visitor) {
        Node node = tree.getRoot();
        if (node == null) {
            return;
        }

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            node = stack.poll();
            visitor.visit(node);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    @Override
    public void traversePostOrder(NodeVisitor visitor) {
        Node node = tree.getRoot();
        Node lastVisitedNode = null;

        Deque<Node> stack = new ArrayDeque<>();

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                Node topNode = stack.peek();
                if (topNode.right != null && lastVisitedNode != topNode.right) {
                    node = topNode.right;
                } else {
                    visitor.visit(topNode);
                    lastVisitedNode = stack.poll();
                }
            }
        }
    }

    @Override
    public void traverseInOrder(NodeVisitor visitor) {
        Node node = tree.getRoot();

        Deque<Node> stack = new ArrayDeque<>();

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                visitor.visit(node);
                node = node.right;
            }
        }
    }

    @Override
    public void traverseReverseInOrder(NodeVisitor visitor) {
        Node node = tree.getRoot();

        Deque<Node> stack = new ArrayDeque<>();

        while (!stack.isEmpty() || node != null) {
            if (node != null) {
                stack.push(node);
                node = node.right;
            } else {
                node = stack.pop();
                visitor.visit(node);
                node = node.left;
            }
        }
    }
}
