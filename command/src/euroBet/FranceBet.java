package euroBet;

public class FranceBet extends Bet {

	@Override
	public void placeBet() {
		System.out.println("You have place a bet on France to win the UEFA Euro 2016. "
				+ "The odds as of 18.06 are 7 to 2");
	}
}
