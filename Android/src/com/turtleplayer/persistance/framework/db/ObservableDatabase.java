package com.turtleplayer.persistance.framework.db;

import com.turtleplayer.controller.Observer;
import com.turtleplayer.model.Instance;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Phan Van Trung
 */

public abstract class ObservableDatabase<Q,C,D> implements Database<Q,C,D>
{

	//--------------------------------------------- Observable

	private final Map<String, DbObserver> observers = new HashMap<String, DbObserver>();

	public void notifyUpdate(Instance instance){
		for(DbObserver observer : observers.values()){
			observer.updated(instance);
		}
	}

	public void notifyCleared(){
		for(DbObserver observer : observers.values()){
			observer.cleared();
		}
	}

	public interface DbObserver extends Observer
	{
		void updated(Instance instance);
		void cleared();
	}

	public void addObserver(DbObserver observer)
	{
		observers.put(observer.getId(), observer);
	}

	public void removeObserver(DbObserver observer)
	{
		observers.remove(observer);
	}
}
