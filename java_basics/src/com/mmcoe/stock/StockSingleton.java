package com.mmcoe.stock;

public final class StockSingleton {
	
	private StockSingleton() {
	}
	
	private static Stock stk;
	
	public static synchronized Stock getStock() {
		if (stk == null)
			stk = new Stock();
		return stk;
	}

	public static synchronized Stock getStock(String ticker, String companyName, double price, int shares) {
		if (stk == null)
			stk = new Stock(ticker, companyName, price, shares);
		return stk;
	}
}
