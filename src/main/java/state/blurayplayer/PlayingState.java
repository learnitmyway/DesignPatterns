package state.blurayplayer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PlayingState implements BluRayPlayerState {
	private static final Logger LOGGER = Logger.getLogger(PlayingState.class.getSimpleName());
	
	private final BluRayPlayer player;
	
	public PlayingState(BluRayPlayer player) {
		this.player = player;
	}

	@Override
	public void insertBluRay() {
		LOGGER.log(Level.SEVERE, "The Blu-ray is playing!");
	}

	@Override
	public void pressPlay() {
		LOGGER.log(Level.WARNING, "The Blu-ray is already playing.");
	}

	@Override
	public void pressStop() {
		LOGGER.log(Level.INFO, "The Blu-ray player now is stopped.");
		player.setState(player.getStoppedState());
	}

	@Override
	public void ejectBluRay() {
		LOGGER.log(Level.SEVERE, "The Blu-ray is playing!");
	}

}
