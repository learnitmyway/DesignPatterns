package superBurgers;

public abstract class Burger {
	String description = "Unknown Burger";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double getCost();
}
