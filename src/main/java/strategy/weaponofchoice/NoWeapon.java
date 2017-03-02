package strategy.weaponofchoice;

public class NoWeapon implements Weapon {

	@Override
	public void attack() {
		System.out.println("potato, potato");
	}
}
