package euroBetLambda;

import java.util.List;

public class MultiBuyCommand implements Command {
	private List<Bet> bets;

	public MultiBuyCommand(List<Bet> bets) {
		this.bets = bets;
	}

	@Override
	public void execute() {
		for (Bet bet : bets) {
			bet.placeBet();
		}
	}
}
