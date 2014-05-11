package com.turtleplayer.player;

import com.turtleplayer.controller.Observer;
import com.turtleplayer.model.Track;

import java.util.HashMap;

/**
 * @author Phan Van Trung
 */

public abstract class ObservableOutput implements OutputAccess
{
	//---------------------------------- Observable

	HashMap<String, PlayerObserver> observers = new HashMap<String, PlayerObserver>();

	protected void notifyTrackChanged(Track track, int lengthInMillis){
		for(PlayerObserver observer : observers.values()){
			observer.trackChanged(track, lengthInMillis);
		}
	}

	protected void notifyStarted(){
		for(PlayerObserver observer : observers.values()){
			observer.started();
		}
	}

	protected void notifyStopped(){
		for(PlayerObserver observer : observers.values()){
			observer.stopped();
		}
	}

	public void addObserver(PlayerObserver observer)
	{
		observers.put(observer.getId(), observer);
	}

	public void removeObserver(Observer observer)
	{
		observers.remove(observer);
	}

	public interface PlayerObserver extends Observer
	{
		void trackChanged(Track track, int lengthInMillis);
		void started();
		void stopped();
	}
}
