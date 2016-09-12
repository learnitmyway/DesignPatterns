package treasureHunt;

import java.util.ArrayList;

public class TreasureHunter {

	// TODO
	public static void main(String[] args) {
		Australia australia = new Australia();
		City[] australianCities = australia.getCities();
		
		for (City city : australianCities) {
			if (city.hasTreasure()) {
				System.out.println("Found treasure in " + city.getName());
			} else {
				System.out.println("Found no treasure in " + city.getName());
			}
		}
		
		Usa usa = new Usa();
		ArrayList<City> usaCities = usa.getCities();

		for (City city : usaCities) {
			if (city.hasTreasure()) {
				System.out.println("Found treasure in " + city.getName());
			} else {
				System.out.println("Found no treasure in " + city.getName());
			}
		}

	}
}
