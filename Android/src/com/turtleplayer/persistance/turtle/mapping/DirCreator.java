package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.FSobject;
import com.turtleplayer.persistance.framework.creator.ResultCreator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class DirCreator implements ResultCreator<Tables.Dirs, FSobject, Cursor>
{
	public FSobject create(Cursor source)
	{
		return new FSobject(
				  source.getString(source.getColumnIndex(Tables.Dirs.PATH.getName())),
				  source.getString(source.getColumnIndex(Tables.Dirs.NAME.getName()))
		);
	}
}
