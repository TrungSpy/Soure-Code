package com.turtleplayer.persistance.source.sqlite;

import android.database.Cursor;
import com.turtleplayer.persistance.source.relational.Table;
import com.turtleplayer.persistance.source.sql.Counter;

/**
 * @author Phan Van Trung
 */

public class CounterSqlite extends Counter
{
	public CounterSqlite(Table table)
	{
		super(table);
	}

	public Integer create(Cursor queryResult)
	{
		queryResult.moveToFirst();
		return queryResult.getInt(0);
	}
}
