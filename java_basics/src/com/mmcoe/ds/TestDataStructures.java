package com.mmcoe.ds;

public class TestDataStructures {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.print();

        System.out.println("Size = " + list.size());

        System.out.println("Element at index 1 = " + list.get(1));
    }
}