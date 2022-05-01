package com.javacore;

public class Main {
    public static void main(String[] args) {
        //8, 100, 98, 10, 2, 15, 45, 25, 76, 3, 9, 1, 63
        //construct a min heap from given data
        System.out.println("The Min Heap is ");
        MinHeap minHeap = new MinHeap(13);
        minHeap.insert(8);
        minHeap.insert(100);
        minHeap.insert(98);
        minHeap.insert(10);
        minHeap.insert(2);
        minHeap.insert(15);
        minHeap.insert(45);
        minHeap.insert(25);
        minHeap.insert(76);
        minHeap.insert(3);
        minHeap.insert(9);
        minHeap.insert(1);
        minHeap.insert(63);

        minHeap.minHeap();
        //display the min heap contents
        minHeap.display();
        //display root node of the min heap

        minHeap.displayAsIs();
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
        System.out.println("The Min val(root node):" + minHeap.remove());
    }
}
