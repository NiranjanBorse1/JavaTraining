package com.mmcoe.cart;

public class TestShopping {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        try {
            cart.addToCart(new Product("Marker", 25));
            cart.addToCart(new Product("Duster", 75));
            cart.addToCart(new Product("Chalk", 10));
            cart.addToCart(new Product("WhiteBoard", 300));
            cart.addToCart(new Product("xyz", 300));
            cart.addToCart(new Product("abc", 300));

        } catch (CartIsFullException e) {

            System.out.println(e.getMessage());

        }

        cart.checkout();
    }
}