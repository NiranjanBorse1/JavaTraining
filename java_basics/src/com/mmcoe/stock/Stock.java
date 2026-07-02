package com.mmcoe.stock;

public class Stock implements Holder, Broker, Exchange {
	private String ticker;
	private String companyName;
	private double price;
	private int availableShares;

	public Stock() {
	}

	public Stock(String ticker, String companyName, double price, int availableShares) {
		this.ticker = ticker;
		this.companyName = companyName;
		this.price = price;
		this.availableShares = availableShares;
	}

	public void viewQuote() {
		System.out.println(companyName + " (" + ticker + ")");
		System.out.println("Price: $" + String.format("%.2f", price));
		System.out.println("Shares: " + availableShares);
	}

	public void getQuote() {
		System.out.println(companyName + " is trading at $" + String.format("%.2f", price));
	}

	public void setQuote() {
		price = price + (Math.random() - 0.5) * 4;
		System.out.println(companyName + " updated to $" + String.format("%.2f", price));
	}

	public String getTicker() {
		return ticker;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return ticker + " - $" + String.format("%.2f", price) + " [" + availableShares + " shares]";
	}
}
