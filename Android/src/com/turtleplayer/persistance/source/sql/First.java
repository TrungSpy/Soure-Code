package com.turtleplayer.persistance.source.sql;

import android.database.Cursor;
import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.framework.mapping.Mapping;
import com.turtleplayer.persistance.source.relational.Table;
import com.turtleplayer.persistance.source.sql.query.Limit;
import com.turtleplayer.persistance.source.sql.query.Select;

/**
 * @author Phan Van Trung
 */

public class First<I> implements Mapping<Select, I, Cursor>
{
	private final Table table;
	private final Creator<I, Cursor> creator;

	public First(Table table,
					  Creator<I, Cursor> creator)
	{
		this.table = table;
		this.creator = creator;
	}

	public Select get()
	{
		Select select = new Select(table);
		select.setLimit(new Limit(1));
		return select;
	}

	public I create(Cursor queryResult)
	{
		if(queryResult.moveToFirst()){
			return creator.create(queryResult);
		}
		else
		{
			return null;
		}

	}
}
