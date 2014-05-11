package com.turtleplayer.persistance.source.sqlite;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.turtleplayer.persistance.framework.query.OperationInsert;
import com.turtleplayer.persistance.framework.mapping.Mapping;
import com.turtleplayer.persistance.source.relational.Table;

/**
 * @author Phan Van Trung
 */

public class InsertOperationSqlLite<I> implements OperationInsert<SQLiteDatabase, I>
{
    private final Mapping<Table, ContentValues, I> mapping;

    public InsertOperationSqlLite(Mapping<Table, ContentValues, I> mapping)
    {
        this.mapping = mapping;
    }

    public int insert(final SQLiteDatabase db, I instance)
	{
		long newRowId = db.insert(mapping.get().getName(), null, mapping.create(instance));
		return (newRowId < 0) ? 0 : 1;
	}
}
