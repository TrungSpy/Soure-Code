package com.turtleplayer.persistance.turtle.filter;

/**
 * @author Phan Van Trung
 */

import com.turtleplayer.persistance.framework.filter.FilterVisitor;

/**
 * @param <R> What the Visitor Produces (can be {@link Void} if nothing gets produced)
 */
public interface TurtleFilterVisitor<PROJECTION, R> extends FilterVisitor<PROJECTION, R>
{
	R visit(DirFilter dirFilter);
}
