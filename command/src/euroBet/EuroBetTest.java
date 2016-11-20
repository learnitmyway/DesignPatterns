package euroBet;

import java.util.ArrayList;
import java.util.List;

// Client
public class EuroBetTest {
	public static void main(String... args) {

		// Invoker
		BookKeeper bookKeeper = new BookKeeper();

		// Receiver
		Bet franceBet = new FranceBet();
		
		// Command
		BuyCommand buyCommand = new BuyCommand(franceBet);

		bookKeeper.setCommand(buyCommand);

		bookKeeper.confirm();
		bookKeeper.cancel();
		
		System.out.println("");

		// Receiver
		Bet germanyBet = new GermanyBet();

		// Command
		BuyCommand buyCommand2 = new BuyCommand(germanyBet);

		bookKeeper.setCommand(buyCommand2);

		bookKeeper.confirm();
		bookKeeper.cancel();
		
		System.out.println("");

		System.out.println("MultiBuyCommand:");

		List<Bet> bets = new ArrayList<>();
		bets.add(franceBet);
		bets.add(germanyBet);
		
		// Command
		MultiBuyCommand multiBuyCommand = new MultiBuyCommand(bets);

		bookKeeper.setCommand(multiBuyCommand);

		bookKeeper.confirm();
		bookKeeper.cancel();
		
	}

}
