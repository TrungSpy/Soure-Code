package com.turtleplayer.persistance.framework.sort;

/**
 * @author Phan Van Trung
 */

public interface OrderVisitor<PROJECTION, R>
{
	<T, Z> R visit(FieldOrder<? super PROJECTION, Z, T> fieldOrder);

	R visit(RandomOrder<? super PROJECTION> orderFilter);

	R visit(OrderSet<? super PROJECTION> orderFilter);
}
