package superBurgers;

public class BeefBurger extends Burger {

	@Override
	public String getDescription() {
		return "Beef";
	}

	@Override
	public double getCost() {
		return 5.75;
	}

}
