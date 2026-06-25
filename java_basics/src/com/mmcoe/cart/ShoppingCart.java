package com.mmcoe.cart;

import com.mmcoe.ds.LinkedList;

public class ShoppingCart implements Shopping {

    private LinkedList<Product> items;
    private double total;

    public ShoppingCart() {
        items = new LinkedList<>();
    }

    public void addToCart(Product p) throws CartIsFullException {

        if (items.size() == 5)
            throw new CartIsFullException("Cart is full !!!!");

        items.add(p);
        total += p.getPrice();
    }

    public void checkout() {

        System.out.println("Items in Cart----------------");

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        System.out.println("Total Amount = " + total);
    }
}