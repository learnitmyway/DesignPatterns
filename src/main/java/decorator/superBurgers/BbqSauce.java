package decorator.superBurgers;

public class BbqSauce implements BurgerDecorator {
	private Burger burger;
	private static final String NAME = "BBQ Sauce";

	public BbqSauce(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + " " + NAME;
	}

	@Override
	public double getCost() {
		return burger.getCost() + 0.20;
	}

}
