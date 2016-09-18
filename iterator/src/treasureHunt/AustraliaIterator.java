package treasureHunt;

import java.util.Iterator;

public class AustraliaIterator implements Iterator<City> {
	private City[] cities;
	private int position = 0;
	
	public AustraliaIterator(City[] cities) {
		this.cities = cities;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= cities.length || cities[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public City next() {
		City city = cities[position];
		position++;
		return city;
	}

}
