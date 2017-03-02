package factory.petstore;

public class Dog extends Pet {

	public Dog() {
		setAnimal("dog");
	}
	
	public void eat(){
		System.out.println("mmm dog food...");
	}

}
