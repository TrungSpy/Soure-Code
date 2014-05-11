/**
 * @author Phan Van Trung
 */

// Package
package com.turtleplayer;

import android.app.Application;
import com.turtleplayer.persistance.turtle.db.TurtleDatabase;
import com.turtleplayer.player.ObservableOutput;
import com.turtleplayer.player.PlayerServiceConnector;
import com.turtleplayer.playlist.Playlist;

public class TurtlePlayer extends Application
{
	public final ObservableOutput player;
	public Playlist playlist;
	public TurtleDatabase db;

	private static TurtlePlayer instance = null;

	public TurtlePlayer()
	{
		player = new PlayerServiceConnector(this);
		/*mp = new MediaPlayer();
		playlist = new Playlist();
		isPaused = true;
		isInitialised = false;
		currentlyPlaying = new Track();*/
	}

	@Override
	public void onCreate()
	{
		instance = this;
	}

	public static TurtlePlayer getStaticInstance()
	{
		if(instance == null){
			throw new IllegalStateException("Not initialized yet");
		}
		return instance;
	}
}
