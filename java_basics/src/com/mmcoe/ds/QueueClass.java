package com.mmcoe.ds;

public class QueueClass {
	 private int[] queue;
	    private int front, rear;
	    private int size;

	    public QueueClass(int size) {
	        this.size = size;
	        queue = new int[size];
	        front = 0;
	        rear = -1;
	    }

	    public void enqueue(int data) {
	        if (rear == size - 1) {
	            System.out.println("Queue Overflow");
	            return;
	        }

	        queue[++rear] = data;
	        System.out.println(data + " inserted");
	    }

	    public int dequeue() {
	        if (front > rear) {
	            System.out.println("Queue Underflow");
	            return -1;
	        }

	        return queue[front++];
	    }

	    public void display() {
	        if (front > rear) {
	            System.out.println("Queue is Empty");
	            return;
	        }

	        System.out.println("Queue Elements:");
	        for (int i = front; i <= rear; i++) {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }
}
