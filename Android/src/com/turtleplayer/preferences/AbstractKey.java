/**
 * @author Phan Van Trung
 */

package com.turtleplayer.preferences;

/**
 * @param <O> object type to store
 * @param <S> stored type
 */
public abstract class AbstractKey<O, S>
{

	private final String key;
	private final O defaultValue;

	AbstractKey(String key,
					O defaultValue)
	{
		this.defaultValue = defaultValue;
		this.key = key;
	}

	public String getKey()
	{
		return key;
	}

	public O getDefaultValue()
	{
		return defaultValue;
	}

	public abstract S marshall(O object);

	public abstract O unmarshall(S object) throws UnmarshallExcpetion;

	public static class UnmarshallExcpetion extends Exception{

		public UnmarshallExcpetion(Throwable throwable)
		{
			super(throwable);
		}
	}
}
