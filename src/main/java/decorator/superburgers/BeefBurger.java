package decorator.superburgers;

public class BeefBurger implements Burger {

	@Override
	public String getDescription() {
		return "Beef";
	}

	@Override
	public double getCost() {
		return 5.75;
	}

}
