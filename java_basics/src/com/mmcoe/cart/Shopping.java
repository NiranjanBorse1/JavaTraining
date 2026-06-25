package com.mmcoe.cart;

public interface Shopping {
	void addToCart(Product p) throws CartIsFullException;
	void checkout() throws CartIsFullException;
}
