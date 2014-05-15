package com.turtleplayer.persistance.source.sql;

import android.content.ContentValues;
import com.turtleplayer.persistance.framework.mapping.Mapping;
import com.turtleplayer.persistance.source.relational.Table;

/**
 * @author Phan Van Trung
 */

public abstract class QueryGeneratorTable<I> implements Mapping<Table, ContentValues, I>
{
	final Table table;

	public QueryGeneratorTable(Table table)
	{
		this.table = table;
	}

	public Table get()
	{
		return table;
	}
}
