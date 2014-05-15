package com.turtleplayer.persistance.source.sql.query;

import com.turtleplayer.persistance.source.relational.Table;

import java.util.Set;

/**
 * @author Phan Van Trung
 */

public class TablesPart implements SqlFragment
{
	private final Set<? extends Table> tables;

	public TablesPart(Set<? extends Table> tables)
	{
		this.tables = tables;
	}

	public String toSql()
	{
		String[] tableNames = new String[tables.size()];
		int i = 0;
		for(Table table : tables)
		{
			tableNames[i++] = table.getName();
		}
		return Helper.getSeparatedList(", ", tableNames);
	}
}
