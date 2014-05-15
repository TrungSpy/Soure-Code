package com.turtleplayer.persistance.turtle.mapping;

import android.content.ContentValues;
import com.turtleplayer.model.AlbumArtLocation;
import com.turtleplayer.persistance.source.sql.QueryGeneratorTable;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class AlbumArtLoactionToDbMapper extends QueryGeneratorTable<AlbumArtLocation>
{
	public AlbumArtLoactionToDbMapper()
	{
		super(Tables.ALBUM_ART_LOCATIONS);
	}

	public ContentValues create(AlbumArtLocation albumArtLocation)
	{
		final ContentValues values = new ContentValues();

		values.put(Tables.AlbumArtLocations.PATH.getName(), albumArtLocation.getPath());
		values.put(Tables.AlbumArtLocations.ALBUM_ART_PATH.getName(), albumArtLocation.getAlbumArtpath());

		return  values;
	}
}
