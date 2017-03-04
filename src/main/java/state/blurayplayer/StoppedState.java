package state.blurayplayer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StoppedState implements BluRayPlayerState {
	private static final Logger LOGGER = Logger.getLogger(StoppedState.class.getSimpleName());

	private final BluRayPlayer player;

	public StoppedState(BluRayPlayer player) {
		this.player = player;
	}

	@Override
	public void insertBluRay() {
		LOGGER.log(Level.SEVERE, "The Blu-ray is already inserted!");
	}

	@Override
	public void pressPlay() {
		LOGGER.log(Level.INFO, "The Blu-ray is now playing.");
		player.setState(player.getPlayingState());
	}

	@Override
	public void pressStop() {
		LOGGER.log(Level.WARNING, "The Blu-ray is already stopped.");
	}

	@Override
	public void ejectBluRay() {
		LOGGER.log(Level.INFO, "The Blu-ray is now ejected.");
		player.setState(player.getHasNoBluRayState());
	}

}
