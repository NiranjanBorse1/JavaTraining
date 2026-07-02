package com.mmcoe.stock;

public class TestStock {
	public static void main(String[] args) {
		Holder h = StockSingleton.getStock("AAPL", "Apple Inc.", 150.25, 1000);
		h.viewQuote();

		Broker b = StockSingleton.getStock();
		b.getQuote();

		Exchange x = StockSingleton.getStock();
		x.setQuote();
	}
}
