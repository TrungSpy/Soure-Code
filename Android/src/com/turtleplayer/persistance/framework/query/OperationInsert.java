package com.turtleplayer.persistance.framework.query;

/**
 * @author Phan Van Trung
 */

/**
 * @param <D> write target eg SQLiteDb
 * @param <I> Object Type of the write information
 */
public interface OperationInsert<D, I>
{
	int insert(D db, I instance);
}
