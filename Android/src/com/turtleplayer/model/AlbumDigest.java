/**
 * @author Phan Van Trung
 */

package com.turtleplayer.model;

import com.turtleplayer.util.Shorty;

public class AlbumDigest implements Album
{
	private static final String EMPTY_REPLACMENT= "Unknown";
	public static final AlbumDigest NO_ALBUM = new AlbumDigest(null);

	private final String id;

	public AlbumDigest(String id)
	{
		this.id = Shorty.avoidNull(id);
	}

	public String getAlbumId()
	{
		return id;
	}

	public String getAlbumName()
	{
		return Shorty.isVoid(id) ? EMPTY_REPLACMENT : id;
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

		AlbumDigest album = (AlbumDigest) o;

		return id.equals(album.id);

	}

	@Override
	public int hashCode()
	{
		return id.hashCode();
	}
}
