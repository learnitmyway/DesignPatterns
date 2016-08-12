package superBurgers;

public class SuperBurgersTest {
	public static void main(String... args) {
		
		System.out.println("The Super Chicken Burger:");
		Burger chickenBurger = new ChickenBurger();
		BurgerDecorator avocado = new Avocado(chickenBurger);
		BurgerDecorator tomato = new Tomato(avocado);
		System.out.println(tomato.getDescription() + " $" + tomato.getCost());

		System.out.println("The Super Beef Burger:");
		BurgerDecorator bbqSauce = new BbqSauce(new Tomato(new BeefBurger()));
		System.out.println(bbqSauce.getDescription() + " $" + bbqSauce.getCost());
	}
}
