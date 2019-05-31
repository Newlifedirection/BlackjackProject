package Program;

import java.util.ArrayList;
import java.util.List;

import CommonCards.Card;
import CommonCards.Deck;

public class Hand {
	
	List<Card> card = new ArrayList<>();
	
	public Hand() {
		
	}

	public int getHandValue() {
		int total = 0;
		for (Card card2 : card) {
			total+= card2.getRank().getValue();
		}
		return total;
	}

	public List<Card> getCard(String total) {
		System.out.print("You have: " + total);
		return card;
	}
		
	//Need to add card to value of hand
	//If value is less than 17, get another card
		
	public void addCard() {
		
	}
	public void clearHand() {
		
	}

	@Override
	public String toString() {
		return null;
	}

}
