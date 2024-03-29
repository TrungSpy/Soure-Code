package com.turtleplayer.persistance.turtle.db.structure;

import com.turtleplayer.persistance.source.relational.Field;
import com.turtleplayer.util.Shorty;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @author Phan Van Trung
 */

public class Views
{
	public final static Albums ALBUMS = new Albums();
	public final static Artists ARTISTS = new Artists();
	public final static Genres GENRES = new Genres();
	public final static Songs SONGS = new Songs();

	public static final class Albums implements Tables.AlbumsReadable
	{
		public Set<Tables.Tracks> getTables()
		{
			return Shorty.oneElementSet(Tables.TRACKS);
		}

		public List<Field> getFields()
		{
			return Arrays.asList(new Field[]{ALBUM});
		}
	}

	public static final class Artists implements Tables.ArtistsReadable
	{
		public Set<Tables.Tracks> getTables()
		{
			return Shorty.oneElementSet(Tables.TRACKS);
		}

		public List<Field> getFields()
		{
			return Arrays.asList(new Field[]{ARTIST});
		}
	}

	public static final class Genres  implements Tables.GenresReadable
	{
		public Set<Tables.Tracks> getTables()
		{
			return Shorty.oneElementSet(Tables.TRACKS);
		}

		public List<Field> getFields()
		{
			return Arrays.asList(new Field[]{GENRE});
		}
	}

	public static final class Songs  implements Tables.SongsReadable
	{
		public Set<Tables.Tracks> getTables()
		{
			return Shorty.oneElementSet(Tables.TRACKS);
		}

		public List<Field> getFields()
		{
			return Arrays.asList(new Field[]{TITLE});
		}
	}

}
