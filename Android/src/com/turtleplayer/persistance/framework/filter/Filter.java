package com.turtleplayer.persistance.framework.filter;

import java.io.Serializable;

/**
 * @author Phan Van Trung
 */

public interface Filter<PROJECTION> extends Serializable
{
	public abstract <R> R accept(FilterVisitor<? extends PROJECTION, R> visitor);
}
