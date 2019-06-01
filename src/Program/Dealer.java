package Program;

import CommonCards.Deck;

public class Dealer extends Player {
	public Deck dealerDeck;
	private int dealerTotal;
//	DealerTotal dealerTotal = new DealerTotal;
//	static 
	// DealerHand dealerHand = new DealerHand;
	Dealer() {
		dealerDeck = new Deck();
	}
	public void dealerDeck() {
		dealerDeck.shuffle();
		dealerDeck.dealCard();
	}
//		boolean keepGoing = true;
//		do {
//		} while (keepGoing);
//	}
	public void dealCard() {
	}

	public void shuffle() {
		dealerDeck.shuffle();
	}

//	public int getHandValue() {
//		int value = dealerHand.getHandValue();
//		return value;
//	}

}
