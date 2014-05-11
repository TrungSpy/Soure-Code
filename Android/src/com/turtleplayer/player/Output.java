package com.turtleplayer.player;

import android.media.MediaPlayer;
import com.turtleplayer.model.Track;

/**
 * @author Phan Van Trung
 */

public interface Output
{

	void change(Track t);

	void play(Track t);

	void toggle();

	/**
	 * @return true if this call had an effect
	 */
	boolean pause();

	/**
	 * @return true if this call had an effect
	 */
	boolean play();

	void goToMillis(int millis);

	int getCurrentMillis();

	Track getCurrTrack();

	void setOnCompletionListener(MediaPlayer.OnCompletionListener listener);
}
