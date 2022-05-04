package com.javacore;


public class BFSMain {
    public static void main(String args[]) {
        //create a graph with 5 vertices
        BFSGraph g = new BFSGraph(5);
        //add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        //print BFS sequence
        System.out.println("Breadth-first traversal of graph with 0 as starting vertex:");
        g.BFS(0);
    }
}
