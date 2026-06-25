package com.mmcoe.ds;

public class LinkedList<T> {

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    private Node head, last;
    private int size;

    public void add(T data) {
        Node n = new Node(data);

        if (head == null)
            head = n;
        else
            last.next = n;

        last = n;
        size++;
    }

    public T get(int idx) {

        if (idx < 0 || idx >= size)
            throw new IllegalArgumentException("Index out of bounds");

        Node temp = head;

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.getData();
    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}