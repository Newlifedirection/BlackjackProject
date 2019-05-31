package CommonCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Program.Rank;
import Program.Suit;

public class Deck {
	private static Rank rank;
	private static Suit suit;
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	private List<Card> createDeck() {
		List<Card> deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
		return deck;
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public List<Card> getCards() {
		return cards;
	}

}
