package Program;

import CommonCards.Deck;

public class BlackjackHand extends Deck {

	public static void main(String[] args) {
		Dealer d = new Dealer();
//		System.out.println(d.dealerDeck());
	}

	int handValue = 0;
	private int HandValue;

	public BlackjackHand() {

	}

	public int getHandValue() {
		return HandValue;
	}

}
