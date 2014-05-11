package com.turtleplayer.persistance.source.relational;

import com.turtleplayer.util.Shorty;

import java.util.Set;

/**
 * @author Phan Van Trung
 */

public abstract class Table implements View
{
	final String name;

	public Table(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public Set<Table> getTables()
	{
		return Shorty.oneElementSet(this);
	}
}
