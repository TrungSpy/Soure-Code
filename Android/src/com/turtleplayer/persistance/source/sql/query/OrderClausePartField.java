package com.turtleplayer.persistance.source.sql.query;

import com.turtleplayer.persistance.framework.sort.SortOrder;
import com.turtleplayer.persistance.source.relational.Field;

/**
 * @author Phan Van Trung
 */

public class OrderClausePartField implements OrderClausePart
{
	final Field field;
	final SqlOrder order;

	public OrderClausePartField(Field field,
										 SortOrder order)
	{
		this.field = field;

		switch (order)
		{
			case ASC:
				this.order = SqlOrder.ASC;
				break;
			case DESC:
				this.order = SqlOrder.DESC;
				break;
			default:
				this.order = SqlOrder.ASC;
		}
	}

	public String toSql()
	{
		return " " + field.getName() + " " + order.toSql() + " ";
	}
}
