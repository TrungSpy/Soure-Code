package com.turtleplayer.persistance.framework.filter;

/**
 * @author Phan Van Trung
 */

/**
 * @param <R> What the Visitor Produces (can be {@link Void} if nothing gets produced)
 */
public interface FilterVisitor<PROJECTION, R>
{
	<T, Z> R visit(FieldFilter<? super PROJECTION, Z, T> fieldFilter);

	R visit(FilterSet<? super PROJECTION> filterSet);

	R visit(NotFilter<? super PROJECTION> notFilter);
}
