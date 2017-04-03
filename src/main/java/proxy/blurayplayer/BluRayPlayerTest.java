package proxy.blurayplayer;

/**
 * Runs the proxy on the blu-ray player introduced in the state pattern.
 */
public class BluRayPlayerTest {

	public static void main(String[] args) {
		
		final BluRayFunctions player = new BluRayRemoteController();

		player.pressPlay();
		player.pressStop();
		player.ejectBluRay();

//		player.insertBluRay();
//		player.insertBluRay();
		player.ejectBluRay();
		player.pressStop();
		player.pressPlay();

	}

}
