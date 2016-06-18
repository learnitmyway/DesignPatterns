package euroBet;

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

	@Override
	public void undo() {
		System.out.println("You are not allowed to cancel your bets");
	}

}
