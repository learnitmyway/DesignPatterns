package treasureHunt;

import java.util.Arrays;
import java.util.Iterator;

// Array
public class Australia implements Country {
	
	private static final int MAX_COUNT = 3;
	private City[] cities;
	private int count = 0;
	
	public Australia() {
		cities = new City[MAX_COUNT];
		addCity("Sydney", false);
		addCity("Melbourne", false);
		addCity("Brisbane", true);
	}

	private void addCity(String cityName, boolean hasTreasure) {
		City city = new City(cityName, hasTreasure);
		cities[count] = city;
		count++;
	}
	
	public Iterator<City> createIterator() {
		return Arrays.asList(cities).iterator();
	}
}
