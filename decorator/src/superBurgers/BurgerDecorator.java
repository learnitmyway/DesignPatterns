package superBurgers;

// Decorator - "Attach additional responsibilities to an object dynamically."
// The burger decorators (ie. toppings) are adding to the burger without modifying the type of burger.
// This abides by "Classes should be open for extension but closed for modification"
public abstract class BurgerDecorator extends Burger {
	public abstract String getDescription();
}
