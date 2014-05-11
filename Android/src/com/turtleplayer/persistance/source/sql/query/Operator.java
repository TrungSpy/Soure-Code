package com.turtleplayer.persistance.source.sql.query;
/**
 * @author Phan Van Trung
 */

public enum Operator
{
	GT(" > "),
	LT(" < "),
	GE(" >= "),
	LE(" <= "),
	EQ(" = "),
	NEQ(" != "),
	LIKE(" LIKE "),
	NOT_LIKE(" NOT LIKE ");

	final String string;

	private Operator(String op)
	{
		this.string = op;
	}

	@Override
	public String toString()
	{
		return string;
	}
}
