package treasureHunt;

import java.util.ArrayList;
import java.util.Iterator;

// List
public class Usa implements Country {

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

	public Iterator<City> createIterator() {
		return cities.iterator();
	}
}
