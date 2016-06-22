package chores;

public class ChoresFacade {
	VacuumChore vacuumChore = new VacuumChore();
	DishesChore dishesChore = new DishesChore();
	CleanWindowsChore cleanWindowsChore = new CleanWindowsChore();

	public void doChores() {
		vacuumChore.bedroom();
		vacuumChore.livingroom();
		dishesChore.wash();
		dishesChore.dry();
		cleanWindowsChore.kitchen();
		cleanWindowsChore.bathroom();
	}

}
