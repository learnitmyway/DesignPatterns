package euroBet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Client
public class EuroBetTest {
	public static void main(String... args) {

		BookKeeper bookKeeper = new BookKeeper();

		Bet franceBet = new FranceBet();
		BuyCommand buyCommand = new BuyCommand(franceBet);

		bookKeeper.setCommand(buyCommand);

		bookKeeper.confirm();
		bookKeeper.cancel();
		
		System.out.println("");

		Bet germanyBet = new GermanyBet();
		BuyCommand buyCommand2 = new BuyCommand(germanyBet);

		bookKeeper.setCommand(buyCommand2);

		bookKeeper.confirm();
		bookKeeper.cancel();
		
		System.out.println("");
		System.out.println("");

		/**************************************/

		List<Bet> bets = new ArrayList<>();
		bets.add(franceBet);
		bets.add(germanyBet);
		
		MultiBuyCommand multiBuyCommand = new MultiBuyCommand(bets);

		bookKeeper.setCommand(multiBuyCommand);

		bookKeeper.confirm();
		bookKeeper.cancel();
		
	}

}
