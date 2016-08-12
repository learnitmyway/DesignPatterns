package superBurgers;

public class ChickenBurger extends Burger {
	
	@Override
	public String getDescription() {
		return "Chicken";
	}

	@Override
	public double getCost() {
		return 5.85;
	}

}
