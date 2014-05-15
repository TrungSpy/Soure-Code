package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.*;
import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class AlbumArtLocationCreator implements Creator<AlbumArtLocation, Cursor>
{
	public AlbumArtLocation create(Cursor cursor)
	{
		return new AlbumArtLocation(
				  cursor.getString(cursor.getColumnIndex(Tables.AlbumArtLocations.PATH.getName())),
				  cursor.getString(cursor.getColumnIndex(Tables.AlbumArtLocations.ALBUM_ART_PATH.getName()))
		);
	}
}
