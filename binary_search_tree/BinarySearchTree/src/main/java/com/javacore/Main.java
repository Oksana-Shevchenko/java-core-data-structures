package com.javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    private static final Integer[] KEYS = new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 13, 15, 16};

    private static final NodeVisitor VISITOR = node -> System.out.print(node.getData() + " ");

    public static void main(String[] args) {
        runDemoWith(new BinarySearchTreeRecursive());
        runDemoWith(new BinarySearchTreeIterative());
    }

    private static void runDemoWith(BinarySearchTree tree) {
        // Create a mutable list so that we can shuffle it
        List<Integer> keys = new ArrayList<>(Arrays.asList(KEYS));
        Collections.shuffle(keys);
        for (Integer key : keys) {
            System.out.println("Adding key " + key);
            tree.insertNode(key);
        }

        System.out.println("\nTree: " + tree);

        System.out.print("\nAll keys in-order: ");
        new DepthFirstTraversalRecursive(tree).traverseInOrder(VISITOR);

        System.out.println("\n\nSearching...");

        for (int key : KEYS) {
            Node node = tree.searchNode(key);
            System.out.println("key = " + key + " --> node.data = " + node.getData());
        }
    }
}
