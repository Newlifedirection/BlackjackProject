package Program;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.projects.blackjack.src.commoncards.Card;
import com.skilldistillery.projects.blackjack.src.commoncards.Deck;

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
