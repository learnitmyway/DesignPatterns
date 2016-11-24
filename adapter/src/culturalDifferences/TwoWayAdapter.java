package culturalDifferences;

public class TwoWayAdapter implements Australian, German {
	German german;
	
	public TwoWayAdapter(German german) {
		this.german = german;
	}

	@Override
	public void watchSport() {
		german.schaueSport();
	}

	@Override
	public void eatFavouriteFood() {
		german.esseLieblingsEssen();
	}
	
	/******* Australian Adapter *****/
	
	Australian australian;
	
	public TwoWayAdapter(Australian australian) {
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
