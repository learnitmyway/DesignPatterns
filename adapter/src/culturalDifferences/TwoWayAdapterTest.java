package culturalDifferences;

public class TwoWayAdapterTest {
	
	public static void main(String... args) {
		German hans = new Hans();
		Australian gerAdapter = new TwoWayAdapter(hans);
		
		gerAdapter.watchSport();
		gerAdapter.eatFavouriteFood();

		Australian harry = new Harry();
		German ausAdapter = new TwoWayAdapter(harry);
		
		ausAdapter.schaueSport();
		ausAdapter.esseLieblingsEssen();
	}


}
