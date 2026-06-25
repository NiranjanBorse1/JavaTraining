package com.mmcoe.ds;

public class TestStackDs {
	 public static void main(String[] args) {
	        StackClass s = new StackClass(5);

	        s.push(10);
	        s.push(20);
	        s.push(30);

	        s.display();

	        System.out.println("Popped Element: " + s.pop());

	        s.display();
	 }
}
