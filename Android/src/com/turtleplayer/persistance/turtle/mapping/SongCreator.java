package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.SongDigest;
import com.turtleplayer.persistance.framework.creator.ResultCreator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class SongCreator implements ResultCreator<Tables.SongsReadable, SongDigest, Cursor>
{

    public SongDigest create(Cursor source)
    {
        return new SongDigest(source.getString(source.getColumnIndex(Tables.SongsReadable.TITLE.getName())));
    }
}
