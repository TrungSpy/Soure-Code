package com.turtleplayer.persistance.turtle.mapping;

import android.content.ContentValues;
import com.turtleplayer.model.Track;
import com.turtleplayer.persistance.source.sql.QueryGeneratorTable;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class TrackToDbMapper extends QueryGeneratorTable<Track>
{
	public TrackToDbMapper()
	{
		super(Tables.TRACKS);
	}

	public ContentValues create(Track track)
	{
		final ContentValues values = new ContentValues();

		values.put(Tables.SongsReadable.TITLE.getName(), track.getSongName());
		values.put(Tables.Tracks.NUMBER.getName(), track.GetNumber());
		values.put(Tables.ArtistsReadable.ARTIST.getName(), track.getArtistId());
		values.put(Tables.AlbumsReadable.ALBUM.getName(), track.getAlbumId());
		values.put(Tables.GenresReadable.GENRE.getName(), track.getGenreId());
		values.put(Tables.FsObjects.PATH.getName(), track.getPath());
		values.put(Tables.FsObjects.NAME.getName(), track.getName());

		return  values;
	}
}
