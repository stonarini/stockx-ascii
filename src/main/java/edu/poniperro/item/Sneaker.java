package edu.poniperro.item;

public class Sneaker implements Item {
	private String style;
	private String name;
	private int sale;
	private int ask;
	private int bid;

	public Sneaker(String name, String style) {
		this.name = name;
		this.style = style;
	}

	@Override
	public int getAsk() {
		return this.ask;
	}

	@Override
	public int getBid() {
		return this.bid;
	}

	@Override
	public int getSale() {
		return this.sale;
	}

	@Override
	public String toString() {
		return this.style + "\n\t\t" + this.name;
	}
}
