package Program;

import java.util.Scanner;

import CommonCards.Card;
import CommonCards.Deck;

public class Dealer {
	public static Deck dealerDeck;
	DealerDeck dealerDeck = new DealerDeck();
	private int dealerTotal;
	DealerTotal dealerTotal = new DealerTotal;
	Hand dealerHand;
	DealerHand dealerHand = new DealerHand;
	public Dealer() {
	}
	private Scanner kb = new Scanner(System.in);
	String input = kb.nextLine();
	public Deck dealerDeck() {
		dealerDeck.getCards();
		dealerDeck.shuffle();
		System.out.println(dealerDeck.toString());
		return dealerDeck;
	}

	public static void main(String[] args) {
		System.out.print("Would you like to start a game ?(1 or 2) ");

		boolean keepGoing = true;
		do {
			dealerDeck.init();
		} while (keepGoing);
	}

	private void init() {
		System.out.println("Please input a number:");
		String input = kb.nextLine();
		System.out.println("Original:\t" + input);
		System.out.println("Translated:\t" + dealerDeck.dealCard(input));
	}

//	Need to show the first card but hide the second until final step
	public int getHandValue() {
		int value = dealerHand.getHandValue();
		return value;
	}
	private static void dealCard() {
	}
	private void init() {
		System.out.print("Hit or Stand?:");
	}
}
