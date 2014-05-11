package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.model.ArtistDigest;
import com.turtleplayer.persistance.framework.creator.ResultCreator;
import com.turtleplayer.persistance.turtle.db.structure.Tables;
import com.turtleplayer.persistance.turtle.db.structure.Views;

/**
 * @author Phan Van Trung
 */

public class ArtistCreator implements ResultCreator<Views.Artists, ArtistDigest, Cursor>
{
    public ArtistDigest create(Cursor source)
    {
        return new ArtistDigest(source.getString(source.getColumnIndex(Tables.ArtistsReadable.ARTIST.getName())));
    }
}
