package iterator.treasurehunt;

public class TreasureHuntTest {

	public static void main(String[] args) {
		Australia australia = new Australia();
		Usa usa = new Usa();
		Germany germany = new Germany();
		TreasureHunter treasureHunter = new TreasureHunter(australia, usa, germany);
		treasureHunter.searchForTreasure();
	}
}
