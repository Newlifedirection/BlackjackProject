package Program;

import java.util.Scanner;

public class BlackjackGame {

	Dealer dealer = new Dealer();
	Player player = new BlackjackPlayer();
	public static void main(String[] args) {
		System.out.print("Would you like to start a game ?(Y or N) ");
		BlackjackGame blackJack = new BlackjackGame();
		blackJack.init();

	}

	private Scanner kb = new Scanner(System.in);
	String input = kb.nextLine();

	private void init() {
		dealer.shuffle();
		player.getHand().addCard(dealer.dealerDeck.dealCard());
		dealer.getHand().addCard(dealer.dealerDeck.dealCard());
		player.getHand().addCard(dealer.dealerDeck.dealCard());
		dealer.getHand().addCard(dealer.dealerDeck.dealCard());
		System.out.println("Player has: " + player.getHand());
		System.out.println("Dealer has: " + dealer.getHand().getCard().get(0));
		
		System.out.println("Hit or stand? (H or S)");
		
		String input = kb.nextLine();
	}
	public void playerChoice() {
		
	}

}
