package Program;

import com.skilldistillery.projects.blackjack.src.commoncards.Deck;

public class Dealer extends Player {
	public Deck dealerDeck;
	private int dealerTotal;
	Dealer() {
		dealerDeck = new Deck();
	}
	public void dealerDeck() {
		dealerDeck.shuffle();
		dealerDeck.dealCard();
	}
	public void dealCard() {
	}
	public void shuffle() {
		dealerDeck.shuffle();
	}

}
