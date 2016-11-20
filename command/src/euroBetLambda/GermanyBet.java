package euroBetLambda;

public class GermanyBet extends Bet {
	
	@Override
	public void placeBet() {
		System.out.println("You have place a bet on Germany to win the UEFA Euro 2016. "
				+ "The odds as of 18.06 are 4 to 1");
	}
}
