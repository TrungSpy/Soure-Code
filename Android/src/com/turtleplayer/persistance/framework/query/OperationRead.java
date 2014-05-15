package com.turtleplayer.persistance.framework.query;

/**
 * @author Phan Van Trung
 */

/**
 * @param <D> write target eg SQLiteDb
 * @param <S> Object type that knows how to do the operation
 * @param <I> Object Type of the write information
 */
public interface OperationRead<Q, R, I>
{
	I map(R dbResult);

	Q get();
}
