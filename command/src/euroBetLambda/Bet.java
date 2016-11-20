package euroBetLambda;

// Receiver
public abstract class Bet {

	public void placeBet() {
		System.out.println("You have made a " + this.getClass().getSimpleName());
	}

}
