package decorator.superBurgers;

public class Tomato implements BurgerDecorator {
	private Burger burger;
	private static final String NAME = "Tomato";

	public Tomato(Burger burger) {
		this.burger = burger;
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + " " + NAME;
	}

	@Override
	public double getCost() {
		return burger.getCost() + 0.30;
	}
}
