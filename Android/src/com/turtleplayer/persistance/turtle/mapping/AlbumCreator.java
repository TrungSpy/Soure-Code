package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.Album;
import com.turtleplayer.model.AlbumDigest;
import com.turtleplayer.persistance.framework.creator.ResultCreator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class AlbumCreator implements ResultCreator<Tables.AlbumsReadable, Album, Cursor>
{
    public Album create(Cursor source)
    {
        return new AlbumDigest(source.getString(source.getColumnIndex(Tables.AlbumsReadable.ALBUM.getName())));
    }
}
