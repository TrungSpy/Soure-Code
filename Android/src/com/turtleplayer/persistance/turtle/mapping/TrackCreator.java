package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.*;
import com.turtleplayer.persistance.framework.creator.ResultCreator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class TrackCreator implements ResultCreator<Tables.Tracks, Track, Cursor>
{
	public Track create(Cursor cursor)
	{
		return new Track(
				  new SongDigest(cursor.getString(cursor.getColumnIndex(Tables.SongsReadable.TITLE.getName()))),
				  new ArtistDigest(cursor.getString(cursor.getColumnIndex(Tables.ArtistsReadable.ARTIST.getName()))),
				  new AlbumDigest(cursor.getString(cursor.getColumnIndex(Tables.AlbumsReadable.ALBUM.getName()))),
				  new GenreDigest(cursor.getString(cursor.getColumnIndex(Tables.GenresReadable.GENRE.getName()))),
				  cursor.getInt(cursor.getColumnIndex(Tables.Tracks.NUMBER.getName())),
				  cursor.getString(cursor.getColumnIndex(Tables.FsObjects.PATH.getName())),
				  cursor.getString(cursor.getColumnIndex(Tables.FsObjects.NAME.getName()))
		);
	}
}
