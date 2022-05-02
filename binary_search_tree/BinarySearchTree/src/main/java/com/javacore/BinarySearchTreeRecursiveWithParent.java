package com.javacore;

public class BinarySearchTreeRecursiveWithParent extends BinarySearchTreeRecursive {
    @Override
    Node insertNode(int key, Node node) {
        node = super.insertNode(key, node);

        // Set parents
        if (node.left != null) {
            node.left.parent = node;
        }
        if (node.right != null) {
            node.right.parent = node;
        }

        return node;
    }

    @Override
    Node deleteNode(int key, Node node) {
        Node newNode = super.deleteNode(key, node);

        // Set parents
        if (newNode != null && node != null && (newNode == node.right || newNode == node.left)) {
            newNode.parent = node.parent;
        }

        return newNode;
    }
}
