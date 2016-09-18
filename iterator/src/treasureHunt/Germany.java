package treasureHunt;

import java.util.HashMap;
import java.util.Iterator;

public class Germany implements Country {
	private HashMap<String, City> cities;
	
	public Germany() {
		cities = new HashMap<>();
		addCity("Cologne", true);
		addCity("Munich", false);
		addCity("Berlin", true);
	}
	
	private void addCity(String cityName, boolean hasTreasure) {
		City city = new City(cityName, hasTreasure);
		cities.put(cityName, city);
	}

	@Override
	public Iterator<City> createIterator() {
		return cities.values().iterator();
	}

}
