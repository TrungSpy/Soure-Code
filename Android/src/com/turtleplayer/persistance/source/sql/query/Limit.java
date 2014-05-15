package com.turtleplayer.persistance.source.sql.query;

/**
 * @author Phan Van Trung
 */

public class Limit implements SqlFragment
{
	final int limit;

	public Limit(int limit)
	{
		this.limit = limit;
	}

	public String toSql()
	{
		return " LIMIT " + limit + " ";
	}
}
