package treasureHunt;

public class TreasureHunt {

	public static void main(String[] args) {
		Australia australia = new Australia();
		Usa usa = new Usa();
		TreasureHunter treasureHunter = new TreasureHunter(australia, usa);
		treasureHunter.searchForTreasure();
	}
}
