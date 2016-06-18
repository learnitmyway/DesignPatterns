package weaponOfChoice;

public abstract class Player {
	Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if (weapon == null) {
			weapon = new NoWeapon();
		}
		weapon.attack();
	}
}
