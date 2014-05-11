package com.turtleplayer.persistance.framework.filter;

import java.util.Set;

/**
 * @author Phan Van Trung
 */

/**
 * @param <I> eg Instance
 */
public interface ResultFilter<I>
{
	Set<I> apply(Set<I> results);
}
