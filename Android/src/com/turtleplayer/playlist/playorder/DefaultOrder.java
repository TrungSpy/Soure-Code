package com.turtleplayer.playlist.playorder;

import com.turtleplayer.model.Track;
import com.turtleplayer.persistance.framework.sort.FieldOrder;
import com.turtleplayer.persistance.framework.sort.OrderSet;
import com.turtleplayer.persistance.framework.sort.SortOrder;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class DefaultOrder extends OrderSet<Tables.Tracks>
{
	public DefaultOrder(SortOrder sortOrder)
	{
		super(new FieldOrder<Tables.Tracks, Track, String>(Tables.ArtistsReadable.ARTIST, sortOrder),
				  new FieldOrder<Tables.Tracks, Track, String>(Tables.AlbumsReadable.ALBUM, sortOrder),
				  new FieldOrder<Tables.Tracks, Track, Integer>(Tables.Tracks.NUMBER, sortOrder),
				  new FieldOrder<Tables.Tracks, Track, String>(Tables.SongsReadable.TITLE, sortOrder)
		);
	}
}
