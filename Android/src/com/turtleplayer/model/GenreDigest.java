/**
 * @author Phan Van Trung
 */

package com.turtleplayer.model;

import com.turtleplayer.util.Shorty;
import com.turtleplayer.util.TurtleUtil;

public class GenreDigest implements Genre
{
	private final String id;
	public static final GenreDigest NO_GENRE = new GenreDigest(null);

	public GenreDigest(String id)
	{
		this.id = Shorty.avoidNull(id);
	}

	public String getGenreId()
	{
		return id;
	}

	public String getGenreName()
	{
		return TurtleUtil.translateGenreId(id);
	}

	public <R> R accept(InstanceVisitor<R> visitor)
	{
		return visitor.visit(this);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GenreDigest genre = (GenreDigest) o;

		return id.equals(genre.id);

	}

	@Override
	public int hashCode()
	{
		return id.hashCode();
	}
}
