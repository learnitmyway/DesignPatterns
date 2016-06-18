package euroBet;

public class CancelBuyCommand implements Command {
	private Bet bet;

	public CancelBuyCommand(Bet bet) {
		this.bet = bet;
	}

	@Override
	public void execute() {
		bet.cancelBet();
	}

	@Override
	public void undo() {
		bet.placeBet();
	}

}
