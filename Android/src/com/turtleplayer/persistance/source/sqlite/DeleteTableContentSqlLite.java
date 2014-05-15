package com.turtleplayer.persistance.source.sqlite;

import android.database.sqlite.SQLiteDatabase;
import com.turtleplayer.persistance.framework.query.OperationDelete;
import com.turtleplayer.persistance.source.relational.Table;

/**
 * @author Phan Van Trung
 */

public class DeleteTableContentSqlLite implements OperationDelete<SQLiteDatabase, Table>
{
	public int delete(SQLiteDatabase db,
							 Table target)
	{
		return db.delete(target.getName(), null, null);
	}
}
