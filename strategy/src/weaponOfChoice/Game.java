package weaponOfChoice;

public class Game {

	public static void main(String[] args) {
		Healer healer = new Healer();

		Warrior axeMan = new Warrior();
		axeMan.setWeapon(new Axe());

		Warrior swordMan = new Warrior();
		swordMan.setWeapon(new Sword());

		Mage mage = new Mage();
		mage.setWeapon(new Staff());

		healer.attack();
		axeMan.attack();
		swordMan.attack();
		mage.attack();
	}

}
