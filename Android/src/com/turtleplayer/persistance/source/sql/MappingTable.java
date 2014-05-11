package com.turtleplayer.persistance.source.sql;

import android.database.Cursor;
import com.turtleplayer.persistance.framework.creator.CreatorForList;
import com.turtleplayer.persistance.framework.mapping.Mapping;
import com.turtleplayer.persistance.source.relational.Table;
import com.turtleplayer.persistance.source.sql.query.Select;

import java.util.List;

/**
 * @author Phan Van Trung
 */

public class MappingTable<TARGET, RESULT> implements Mapping<Select, List<RESULT>, Cursor>
{
	private final Table table;
    private final CreatorForList<TARGET, RESULT, Cursor, Cursor> creator;

	public MappingTable(Table table, CreatorForList<TARGET, RESULT, Cursor, Cursor> creator)
	{
		this.table = table;
        this.creator = creator;
	}

	public Select get()
	{
		return new Select(table);
	}

    public List<RESULT> create(Cursor queryResult)
    {
        return creator.create(queryResult);
    }
}
