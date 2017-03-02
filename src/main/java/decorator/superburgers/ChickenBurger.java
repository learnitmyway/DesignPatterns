package decorator.superburgers;

public class ChickenBurger implements Burger {
	
	@Override
	public String getDescription() {
		return "Chicken";
	}

	@Override
	public double getCost() {
		return 5.85;
	}

}
