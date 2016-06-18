package euroBet;

// Receiver
public abstract class Bet {

	public void placeBet() {
		System.out.println("You have made a " + this.getClass().getSimpleName());
	}

	public void cancelBet() {
		System.out.println("You are not allowed to cancel your bet");
	}

}
