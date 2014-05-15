package com.turtleplayer.preferences;

/**
 * @author Phan Van Trung
 */

public class Key<T> extends AbstractKey<T,T>
{
	Key(String key,
		 T defaultValue)
	{
		super(key, defaultValue);
	}

	@Override
	public T marshall(T object)
	{
		return object;
	}

	@Override
	public T unmarshall(T object)
	{
		return object;
	}
}
