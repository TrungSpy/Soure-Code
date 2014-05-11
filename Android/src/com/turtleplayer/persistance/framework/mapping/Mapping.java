package com.turtleplayer.persistance.framework.mapping;

import com.turtleplayer.persistance.framework.creator.Creator;

/**
 * @author Phan Van Trung
 *
 * Knows how to create I's from C's  which are dependent from Q
 * Eg: Knows How to create an Instance I from Query result Cursor C from Sql Q
 *
 * @param <Q> eg sql String
 * @param <I> resulting instance
 * @param <C> eg cursor
 */
public interface Mapping<Q, I, C> extends Creator<I, C>, QueryGenerator<Q>
{
	Q get();
	I create(C queryResult);
}
