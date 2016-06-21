package adapter;

public class GermanAdapter implements Australian {
	German german;
	
	public GermanAdapter(German german) {
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

}