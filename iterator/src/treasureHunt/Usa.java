package treasureHunt;

import java.util.ArrayList;

public class Usa {

	private ArrayList<City> cities;
	
	public Usa() {
		
		cities = new ArrayList<>();
		addCity("New York City", false);
		addCity("Washington D.C.", false);
		addCity("San Fran", true);
	}

	private void addCity(String cityName, boolean hasTreasure) {
		City city = new City(cityName, hasTreasure);
		cities.add(city);
	}
	
	public ArrayList<City> getCities() {
		return cities;
	}
}
