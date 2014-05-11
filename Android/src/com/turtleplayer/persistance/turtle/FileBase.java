package com.turtleplayer.persistance.turtle;

import com.turtleplayer.model.*;
import com.turtleplayer.persistance.framework.filter.Filter;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

import java.util.Collection;

/**
 * @author Phan Van Trung
 */

/**
 * @param <Q> eg sql as String
 */
public interface FileBase
{
	Collection<? extends Track> getTracks(Filter<? super Tables.Tracks> filter);

	Collection<? extends Album> getAlbums(Filter<? super Tables.Tracks> filter);

	Collection<? extends Artist> getArtists(Filter<? super Tables.Tracks> filter);

	Collection<? extends Genre> getGenres(Filter<? super Tables.Tracks> filter);

	Collection<? extends Song> getSongs(Filter<? super Tables.Tracks> filter);
}
