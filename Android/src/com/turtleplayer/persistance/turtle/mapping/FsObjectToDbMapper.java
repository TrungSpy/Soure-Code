package com.turtleplayer.persistance.turtle.mapping;

import android.content.ContentValues;
import com.turtleplayer.model.FSobject;
import com.turtleplayer.persistance.source.sql.QueryGeneratorTable;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class FsObjectToDbMapper extends QueryGeneratorTable<FSobject>
{
	public FsObjectToDbMapper()
	{
		super(Tables.DIRS);
	}

	public ContentValues create(FSobject fsObject)
	{
		final ContentValues values = new ContentValues();

		values.put(Tables.Dirs.NAME.getName(), fsObject.getName());
		values.put(Tables.Dirs.PATH.getName(), fsObject.getPath());

		return  values;
	}
}
