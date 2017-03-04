package state.blurayplayer;

public class BluRayPlayerTest {

	public static void main(String[] args) {
		
		final BluRayPlayer player = new BluRayPlayer();

		player.pressPlay();
		player.pressStop();
		player.ejectBluRay();

		player.insertBluRay();
		player.insertBluRay();
		player.ejectBluRay();
		player.pressStop();
		player.pressPlay();

	}

}
