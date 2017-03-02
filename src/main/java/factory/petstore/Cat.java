package factory.petstore;

public class Cat extends Pet {

	public Cat() {
		setAnimal("cat");
	}

	public void eat(){
		System.out.println("mmm cat food...");
	}

}
