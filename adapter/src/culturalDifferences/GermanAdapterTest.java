package culturalDifferences;

public class GermanAdapterTest {
	public static void main(String... args) {
		German hans = new Hans();
		Australian gerAdapter = new GermanAdapter(hans);
		
		gerAdapter.watchSport();
		gerAdapter.eatFavouriteFood();
	}
}
