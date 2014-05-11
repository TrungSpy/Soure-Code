package com.turtleplayer.persistance.source.sql;

import android.database.Cursor;
import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.source.relational.Table;
import com.turtleplayer.persistance.source.sql.query.Limit;
import com.turtleplayer.persistance.source.sql.query.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Phan Van Trung
 */

public class Limited<I> extends First<List<I>>
{
	private final int limit;

	public Limited(Table table,
						Creator<List<I>, Cursor> creator,
						int limit)
	{
		super(table, creator);
		this.limit = limit;
	}

	public Select get()
	{
		Select select = super.get();
		select.setLimit(new Limit(limit));
		return select;
	}

	public List<I> create(Cursor queryResult)
	{
		List<I> result = super.create(queryResult);
		return result == null ? new ArrayList<I>() : result;
	}
}
