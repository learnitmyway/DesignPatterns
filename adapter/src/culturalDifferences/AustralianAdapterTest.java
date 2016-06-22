package culturalDifferences;

public class AustralianAdapterTest {
	public static void main(String... args) {
		Australian harry = new Harry();
		German ausAdapter = new AustralianAdapter(harry);
		
		ausAdapter.schaueSport();
		ausAdapter.esseLieblingsEssen();
	}
}
