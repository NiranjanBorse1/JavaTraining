package com.mmcoe.ds;

public class TestQueueDs {
	 public static void main(String[] args) {
	        QueueClass q = new QueueClass(5);

	        q.enqueue(10);
	        q.enqueue(20);
	        q.enqueue(30);

	        q.display();

	        System.out.println("Deleted Element: " + q.dequeue());

	        q.display();
	    }
}
