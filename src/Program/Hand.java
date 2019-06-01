package Program;

import java.util.ArrayList;
import java.util.List;

import CommonCards.Card;
import CommonCards.Deck;

public class Hand {
	private List<Card> card;
	public Hand() {
		card = new ArrayList<>();
		
	}

	public int getHandValue() {
		int total = 0;
		for (Card card2 : card) {
			total+= card2.getRank().getValue();
		}
		return total;
	}

	public Hand(List<Card> card) {
		super();
		this.card = card;
	}

	public List<Card> getCard() {
		return card;
	}
		
	//Need to add card to value of hand
	//If value is less than 17, get another card
		
	public Card addCard(Card card2) {
		card.add(card2);
		return card2;
	}
	public void clearHand() {
		
	}

	@Override
	public String toString() {
		return "Hand [" + card + "]";
	}


}
