package edu.poniperro.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.item.Item;
import edu.poniperro.offer.Bid;
import edu.poniperro.offer.Offer;

public class Bids implements Criteria {
	public Bids() {

	}

	@Override
	public List<Offer> checkCriteria(Item item) {
		return item.offers().stream()
				.filter(o -> o instanceof Bid)
				.sorted((o1, o2) -> o2.compareTo(o1))
				.collect(Collectors.toList());
	}
}
