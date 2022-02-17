package edu.poniperro.item;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.offer.Offer;

public class Sneaker implements Item {
	private String style;
	private String name;
	private int sale;
	private int ask;
	private int bid;
	private final List<Offer> offers = new ArrayList<Offer>();

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
	public void add(Offer offer) {
		this.offers.add(offer);
	}

	@Override
	public void setAsk(int ask) {
		this.ask = ask;
	}

	@Override
	public void setSale(int sale) {
		this.sale = sale;
	}

	@Override
	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public List<Offer> offers() {
		return this.offers;
	}

	@Override
	public String toString() {
		return this.style + "\n\t\t" + this.name;
	}
}
