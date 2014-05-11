package com.turtleplayer.persistance.framework.sort;

import com.turtleplayer.persistance.source.relational.FieldPersistable;

/**
 * @author Phan Van Trung
 */

public abstract class OrderVisitorGenerified<TARGET, RESULT, TYPE, R> implements OrderVisitor<TARGET, R>
{
	public abstract R visit(FieldOrder<TARGET, RESULT, TYPE> fieldOrder,
									FieldPersistable<RESULT, TYPE> field);

	final public <T, Z> R visit(FieldOrder<? super TARGET, Z, T> fieldOrder)
	{
		return visit((FieldOrder<TARGET, RESULT, TYPE>)fieldOrder, (FieldPersistable<RESULT, TYPE>)fieldOrder.getField());
	}
}
