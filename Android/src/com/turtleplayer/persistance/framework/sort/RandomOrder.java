package com.turtleplayer.persistance.framework.sort;

/**
 * @author Phan Van Trung
 */

public class RandomOrder<PROJECTION> implements Order<PROJECTION>
{

	public <R> R accept(OrderVisitor<? extends PROJECTION, R> visitor)
	{
		return visitor.visit(this);
	}
}
