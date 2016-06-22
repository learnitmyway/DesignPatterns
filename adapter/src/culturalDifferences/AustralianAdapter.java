package culturalDifferences;

public class AustralianAdapter implements German {
	Australian australian;
	
	public AustralianAdapter(Australian australian) {
		this.australian = australian;
	}

	@Override
	public void schaueSport() {
		australian.watchSport();
	}

	@Override
	public void esseLieblingsEssen() {
		australian.eatFavouriteFood();
	}

}
