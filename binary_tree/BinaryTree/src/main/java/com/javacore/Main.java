package com.javacore;

public class Main {
    private static final NodeVisitor VISITOR = node -> System.out.print(node.getData() + " ");

    public static void main(String[] args) {
        SimpleBinaryTree tree = createSampleTree();
        traverseTreeInVariousWays(tree);
    }

    private static SimpleBinaryTree createSampleTree() {
        SimpleBinaryTree tree = new SimpleBinaryTree();

        Node root = tree.insertRoot(3);

        // Left sub-tree of root
        Node node1 = tree.insertNode(1, root, SimpleBinaryTree.Side.LEFT);
        Node node13 = tree.insertNode(13, node1, SimpleBinaryTree.Side.LEFT);

        // Right sub-tree of root
        Node node10 = tree.insertNode(10, root, SimpleBinaryTree.Side.RIGHT);
        Node node11 = tree.insertNode(11, node10, SimpleBinaryTree.Side.LEFT);
        Node node16 = tree.insertNode(16, node10, SimpleBinaryTree.Side.RIGHT);
        Node node15 = tree.insertNode(15, node16, SimpleBinaryTree.Side.LEFT);
        Node node2 = tree.insertNode(2, node16, SimpleBinaryTree.Side.RIGHT);

        return tree;
    }



    private static void traverseTreeInVariousWays(BinaryTree tree) {
        DepthFirstTraversal depthFirst = new DepthFirstTraversalRecursive(tree);
        DepthFirstTraversal depthFirstIterative = new DepthFirstTraversalIterative(tree);
        BreadthFirstTraversal breadthFirst = new BreadthFirstTraversal(tree);

        System.out.println("Pre-order (recursive):");
        depthFirst.traversePreOrder(VISITOR);
        System.out.println("\nPre-order (iterative):");
        depthFirstIterative.traversePreOrder(VISITOR);

        System.out.println("\n\nPost-order (recursive):");
        depthFirst.traversePostOrder(VISITOR);
        System.out.println("\nPost-order (iterative):");
        depthFirstIterative.traversePostOrder(VISITOR);

        System.out.println("\n\nIn-order (recursive):");
        depthFirst.traverseInOrder(VISITOR);
        System.out.println("\nIn-order (iterative):");
        depthFirstIterative.traverseInOrder(VISITOR);

        System.out.println("\n\nReverse in-order (recursive):");
        depthFirst.traverseReverseInOrder(VISITOR);
        System.out.println("\nReverse in-order (iterative):");
        depthFirstIterative.traverseReverseInOrder(VISITOR);

        System.out.println("\n\nLevel-order:");
        breadthFirst.traverseLevelOrder(VISITOR);
    }
}


//              3
//      1               10
//  13              11      16
//                       15    2