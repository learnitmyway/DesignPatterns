package chores;

public class ChoresTest {
	
	public static void main (String... args) {
		
		System.out.println("This week:");
		VacuumChore vacuumChore = new VacuumChore();
		vacuumChore.bedroom();
		vacuumChore.livingroom();

		System.out.println("");
		System.out.println("One week later:");
		ChoresFacade choresFacade = new ChoresFacade();
		choresFacade.doChores();
		
	}

}
