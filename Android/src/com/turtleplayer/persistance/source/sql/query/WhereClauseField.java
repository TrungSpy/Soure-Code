package com.turtleplayer.persistance.source.sql.query;

import com.turtleplayer.persistance.source.relational.Field;

import java.util.Arrays;
import java.util.List;

/**
 * @author Phan Van Trung
 */

public class WhereClauseField implements WhereClausePart
{

	final Field field;
	final Object value;
	final Operator op;

	public WhereClauseField(Field field,
									Object value,
									Operator op)
	{
		this.field = field;
		this.value = value;
		this.op = op;
	}

	public String toSql()
	{
		return " " + field.getName() + op + " ? ";
	}

	public List<Object> getParams()
	{
		return Arrays.asList(value);
	}
}
