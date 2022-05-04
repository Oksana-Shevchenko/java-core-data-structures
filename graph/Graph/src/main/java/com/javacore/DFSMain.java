package com.javacore;

public class DFSMain {
    public static void main(String[] args) {
        //create a graph object and add edges to it
        DFSGraph g = new DFSGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        //print the DFS Traversal sequence
        System.out.println("Depth First Traversal for given graph (with 0 as starting vertex)");
        g.DFS(0);
    }
}
