package adapter;

public class Harry implements Australian {

	@Override
	public void watchSport() {
		System.out.println("Harry enjoys watching rugby");
	}

	@Override
	public void eatFavouriteFood() {
		System.out.println("Harry enjoys eating avocado");
	}

}
