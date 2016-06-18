package petStore;

public class PetStore {

	public PetStore() {
		// TODO Auto-generated constructor stub
	}

	public Pet allocatePet(String choice) {
		if (choice == "dog") {
			return new Dog();
		} else if (choice == "cat") {
			return new Cat();
		} else {
			throw new IllegalArgumentException("Unfortunately, we don't have that pet");
		}
	}

}
