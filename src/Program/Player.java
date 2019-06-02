package Program;

public abstract class Player {

	private Hand hand;
	public Player() {
		hand = new Hand();
		
		System.out.println();
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}

}
