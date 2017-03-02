package factory.petstore;

public class Customer {

	public static void main(String[] args) {
		Pet dog = new PetStore().allocatePet("dog");
		Pet cat = new PetStore().allocatePet("cat");
		
		dog.play();
		dog.eat();
		dog.sleep();

		cat.play();
		cat.eat();
		cat.sleep();

	}

}
