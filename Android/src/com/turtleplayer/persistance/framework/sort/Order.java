package com.turtleplayer.persistance.framework.sort;

/**
 * @author Phan Van Trung
 */

/**
 * @param <Q> eg sql as String
 */
public interface Order<PROJECTION>
{
	<R> R accept(OrderVisitor<? extends PROJECTION, R> visitor);
}
