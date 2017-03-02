package factory.petstore;

public abstract class Pet {
	private String animal;

	public void play() {
		System.out.println("the " + animal + " is playing...");
	}

	public abstract void eat();

	public void sleep() {
		System.out.println("the " + animal + " is sleeping...");
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}

}
