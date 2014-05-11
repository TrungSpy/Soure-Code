package com.turtleplayer.persistance.framework.query;

/**
 * @author Phan Van Trung
 */

public interface OperationDelete<D, T>
{
	int delete(D db, T target);
}
