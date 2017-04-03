package proxy.blurayplayer;

import state.blurayplayer.BluRayPlayer;

public class BluRayRemoteController implements BluRayFunctions {
	private BluRayPlayer bluRayPlayer;

	public BluRayRemoteController() {
		bluRayPlayer = new BluRayPlayer();
	}

	@Override
	public void pressPlay() {
		bluRayPlayer.pressPlay();
	}

	@Override
	public void pressStop() {
		bluRayPlayer.pressStop();
	}

	@Override
	public void ejectBluRay() {
		bluRayPlayer.ejectBluRay();
	}

}
