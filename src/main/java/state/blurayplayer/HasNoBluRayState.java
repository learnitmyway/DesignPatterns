package state.blurayplayer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HasNoBluRayState implements BluRayPlayerState {
	private final static Logger LOGGER = Logger.getLogger(HasNoBluRayState.class.getSimpleName());

	private final BluRayPlayer player;

	public HasNoBluRayState(BluRayPlayer player) {
		this.player = player;
	}

	@Override
	public void insertBluRay() {
		LOGGER.log(Level.INFO, "The Blu-ray is now inserted.");
		player.setState(player.getHasBluRayState());

	}

	@Override
	public void pressPlay() {
		LOGGER.log(Level.WARNING, "The Blu-ray has not been inserted yet.");
	}

	@Override
	public void pressStop() {
		LOGGER.log(Level.WARNING, "The Blu-ray has not been inserted yet.");
	}

	@Override
	public void ejectBluRay() {
		LOGGER.log(Level.WARNING, "The Blu-ray has not been inserted yet.");
	}

}
