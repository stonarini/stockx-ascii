package edu.poniperro.offer;

public class Ask implements Offer {
	private String size;
	private int ask;

	public Ask(String size, int ask) {
		this.size = size;
		this.ask = ask;
	}

	@Override
	public String size() {
		return this.size;
	}

	@Override
	public int value() {
		return this.ask;
	}

	@Override
	public int compareTo(Offer offer) {
		return Integer.compare(this.ask, offer.value());
	}

	@Override
	public String toString() {
		return this.size + " " + this.ask;
	}
}
