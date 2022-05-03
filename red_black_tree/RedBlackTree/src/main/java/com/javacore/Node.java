package com.javacore;

public class Node {
    int data;
    Node left;
    Node right;
    Node parent;
    boolean color;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node getParent() {
        return parent;
    }

    public boolean isColor() {
        return color;
    }
}
