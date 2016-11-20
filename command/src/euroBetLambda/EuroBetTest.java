package euroBetLambda;

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
		Command franceBetBuyCommand = franceBet::placeBet;

		bookKeeper.setCommand(franceBetBuyCommand);

		bookKeeper.confirm();
		
		System.out.println("");

		// Receiver
		Bet germanyBet = new GermanyBet();

		// Command
		Command germanyBetBuyCommand = germanyBet::placeBet;
		bookKeeper.setCommand(germanyBetBuyCommand);

		bookKeeper.confirm();
		
		System.out.println("");

		System.out.println("MultiBuyCommand:");

		List<Bet> bets = new ArrayList<>();
		bets.add(franceBet);
		bets.add(germanyBet);
		
		// Command
		MultiBuyCommand multiBuyCommand = new MultiBuyCommand(bets);

		bookKeeper.setCommand(multiBuyCommand);

		bookKeeper.confirm();
		
	}

}
