package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.GenreDigest;
import com.turtleplayer.persistance.framework.creator.ResultCreator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class GenreCreator implements ResultCreator<Tables.GenresReadable, GenreDigest, Cursor>
{
    public GenreDigest create(Cursor source)
    {
        return new GenreDigest(source.getString(source.getColumnIndex(Tables.GenresReadable.GENRE.getName())));
    }
}
