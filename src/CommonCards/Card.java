package CommonCards;

import Program.Rank;
import Program.Suit;

public class Card {
	private Rank rank;
	private Suit suit;
//	private Value value;

	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
//		System.out.println(this);
//		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
//	public Value getValue() {
//		return value;
//	}

	@Override
	public String toString() {
		return (rank + " 0f " + suit);
	}

//	private String Card(String string) {
//		return null;
//	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void add(Card card) {
		
	}

}
