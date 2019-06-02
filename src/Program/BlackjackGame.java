package Program;

import java.util.Scanner;

public class BlackjackGame {

	Dealer dealer = new Dealer();
	Player player = new BlackjackPlayer();

	public static void main(String[] args) {
		System.out.print("Would you like to start a game ?(Y or N) ");
		String input = kb.nextLine();
		BlackjackGame blackJack = new BlackjackGame();
		blackJack.init();

	}

	private static Scanner kb = new Scanner(System.in);

	private void init() {

		boolean keepPlaying = true;
		dealer.shuffle();
		player.getHand().addCard(dealer.dealerDeck.dealCard());
		dealer.getHand().addCard(dealer.dealerDeck.dealCard());
		player.getHand().addCard(dealer.dealerDeck.dealCard());
		dealer.getHand().addCard(dealer.dealerDeck.dealCard());
		do {
			System.out.println("Player has: " + player.getHand());
			System.out.println("Dealer has: " + dealer.getHand().getCard().get(0));

			System.out.println("Hit or stand? (H or S)");

			String playerChoice = kb.nextLine();

			if (playerChoice.equals("H")) {
				player.getHand().addCard(dealer.dealerDeck.dealCard());
				if (player.getHand().getHandValue() > 21) {
					System.out.println("Bust. Game over");
					System.exit(0);

					System.out.println();
				}
			} else {
				keepPlaying = false;
				System.out.println("Player stands");
			}
		} while (keepPlaying);

		while (dealer.getHand().getHandValue() < 17) {
			dealer.getHand().addCard(dealer.dealerDeck.dealCard());
			System.out.println("Dealer takes another card");
		}
		if (player.getHand().getHandValue() > 21) {
			System.out.println("Bust. Game over");
			System.exit(0);
		}
		else if(dealer.getHand().getHandValue() == 21) {
			System.out.println("Dealer wins");
		}
		else if(dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
			System.out.println("Dealer wins");
		}
		else if(dealer.getHand().getHandValue()== player.getHand().getHandValue()) {
			System.out.println("Tie, nobody wins");
		}
		else if(player.getHand().getHandValue()> dealer.getHand().getHandValue()) {
			System.out.println("Player wins!");
		}
		else if(dealer.getHand().getHandValue()<player.getHand().getHandValue()) {
			System.out.println("Dealer wins");
		}
	}

}
