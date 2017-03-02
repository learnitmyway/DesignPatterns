package decorator.superBurgers;

public class Avocado implements BurgerDecorator {
	private Burger burger;
	private static final String NAME = "Avocado";

	public Avocado(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + " " + NAME;
	}

	@Override
	public double getCost() {
		return burger.getCost() + 1.20;
	}
}
