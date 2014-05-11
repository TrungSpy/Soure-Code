package com.turtleplayer.persistance.source.sql.query;

/**
 * @author Phan Van Trung
 */

public enum SqlOrder
{
	ASC(" ASC "),
	DESC(" DESC ");

	final String sql;

	private SqlOrder(String sql)
	{
		this.sql = sql;
	}


	public String toSql()
	{
		return sql;
	}
}
