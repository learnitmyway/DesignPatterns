package state.blurayplayer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BluRayPlayer {
	private static final Logger LOGGER = Logger.getLogger(BluRayPlayer.class.getSimpleName());

	private final HasBluRayState hasBluRayState;
	private final PlayingState playingState;
	private final StoppedState stoppedState;
	private final HasNoBluRayState hasNoBluRayState;

	private BluRayPlayerState state;

	public BluRayPlayer() {
		hasBluRayState = new HasBluRayState(this);
		playingState = new PlayingState(this);
		stoppedState = new StoppedState(this);
		hasNoBluRayState = new HasNoBluRayState(this);

		state = hasBluRayState;
		LOGGER.log(Level.INFO, "The Blu-ray has been inserted.");
	}

	public void insertBluRay() {
		state.insertBluRay();
	}

	public void pressPlay() {
		state.pressPlay();
	}

	public void pressStop() {
		state.pressStop();
	}

	public void ejectBluRay() {
		state.ejectBluRay();
	}

	public BluRayPlayerState getState() {
		return state;
	}

	public void setState(BluRayPlayerState state) {
		this.state = state;
	}

	public HasBluRayState getHasBluRayState() {
		return hasBluRayState;
	}

	public PlayingState getPlayingState() {
		return playingState;
	}

	public StoppedState getStoppedState() {
		return stoppedState;
	}

	public HasNoBluRayState getHasNoBluRayState() {
		return hasNoBluRayState;
	}

}
