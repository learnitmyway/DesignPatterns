package iterator.treasurehunt;

public class City {

	private String cityName;
	private boolean hasTreasure;

	public City(String cityName, boolean hasTreasure) {
		super();
		this.cityName = cityName;
		this.hasTreasure = hasTreasure;
	}

	public String getName() {
		return cityName;
	}

	public boolean hasTreasure() {
		return hasTreasure;
	}

}
