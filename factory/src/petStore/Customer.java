package petStore;

public class Customer {

	public static void main(String[] args) {
		Pet dog = new PetStore().allocatePet("dog");
		Pet cat = new PetStore().allocatePet("cat");
		//Pet elephant = new PetStore().allocatePet("elephant");
		
		dog.play();
		dog.eat();
		dog.sleep();

		cat.play();
		cat.eat();
		cat.sleep();

	}

}
