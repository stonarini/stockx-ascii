package edu.poniperro.offer;

public class Bid implements Offer {
	private String size;
	private int bid;

	public Bid(String size, int bid) {
		this.size = size;
		this.bid = bid;
	}

	@Override
	public String size() {
		return this.size;
	}

	@Override
	public int value() {
		return this.bid;
	}

	@Override
	public int compareTo(Offer offer) {
		return Integer.compare(this.bid, offer.value());
	}

	@Override
	public String toString() {
		return this.size + " " + this.bid;
	}
}
