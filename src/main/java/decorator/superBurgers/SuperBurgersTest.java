package decorator.superBurgers;

public class SuperBurgersTest {
	public static void main(String... args) {
		
		System.out.println("The Super Chicken Burger:");
		Burger chickenBurger = new ChickenBurger();
		chickenBurger = new Avocado(chickenBurger);
		chickenBurger = new Tomato(chickenBurger);
		System.out.println(chickenBurger.getDescription() + " $" + chickenBurger.getCost());

		System.out.println("The Super Beef Burger:");
		final Burger beefBurger = new BbqSauce(new Tomato(new BeefBurger()));
		System.out.println(beefBurger.getDescription() + " $" + beefBurger.getCost());
	}
}
