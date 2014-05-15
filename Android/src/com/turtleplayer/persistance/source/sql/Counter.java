package com.turtleplayer.persistance.source.sql;

import android.database.Cursor;
import com.turtleplayer.persistance.framework.mapping.Mapping;
import com.turtleplayer.persistance.source.relational.Table;
import com.turtleplayer.persistance.source.sql.query.Select;
import com.turtleplayer.persistance.source.sql.query.Sql;

/**
 * @author Phan Van Trung
 */

public abstract class Counter implements Mapping<Select, Integer, Cursor>
{
	private final Table table;

	public Counter(Table table)
	{
		this.table = table;
	}

	public Select get()
	{
		return new Select(table, Select.SelectMethod.COUNT, Sql.FIELD_PSEUDO_STAR);
	}
}
