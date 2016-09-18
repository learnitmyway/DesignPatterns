package treasureHunt;

import java.util.Iterator;

public class TreasureHunter {
	private Australia australia;
	private Usa usa;
	private Germany germany;
	
	public TreasureHunter(Australia australia, Usa usa, Germany germany) {
		this.australia = australia;
		this.usa = usa;
		this.germany = germany;
	}
	
	public void searchForTreasure() {
		final Iterator<City> australiaIterator = australia.createIterator();
		searchForTreasureInCountry(australiaIterator);
		
		Iterator<City> usaIterator = usa.createIterator();
		searchForTreasureInCountry(usaIterator);

		Iterator<City> germanyIterator = germany.createIterator();
		searchForTreasureInCountry(germanyIterator);
	}

	private void searchForTreasureInCountry(Iterator<City> countryIterator) {
		while (countryIterator.hasNext()) {
			final City city = countryIterator.next();
			if (city.hasTreasure()) {
				System.out.println("Found treasure in " + city.getName());
			} else {
				System.out.println("Found no treasure in " + city.getName());
			}
		}
	}
}
