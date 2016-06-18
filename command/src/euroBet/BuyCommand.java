package euroBet;

public class BuyCommand implements Command {
	private Bet bet;

	public BuyCommand(Bet bet) {
		this.bet = bet;
	}

	@Override
	public void execute() {
		bet.placeBet();
	}

	@Override
	public void undo() {
		bet.cancelBet();
	}

}
