package Program;

import java.util.Scanner;

import CommonCards.Card;
import CommonCards.Deck;

public class Dealer {

	private Deck dealerDeck;
	private static int dealerTotal;
		Hand dealerHand;
	public Dealer() {

	}

	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many cards would you like ?(1 or 2) ");
		
	}

//	Need to show the first card but hide the second until final step
	String input = kb.nextLine();
	
	public void 

	public int getHandValue() {
		int value = dealerHand.getHandValue();
		return value;
	}

	private static void dealCard() {
		// TODO Auto-generated method stub

	}

	private void init() {
		System.out.print("Hit or Stand?:");
	}

}
