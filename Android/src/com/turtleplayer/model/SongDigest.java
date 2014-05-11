/**
 * @author Phan Van Trung
 */

package com.turtleplayer.model;


import com.turtleplayer.util.Shorty;

public class SongDigest implements Song
{

	private static final String EMPTY_REPLACMENT= "Unknown";
	private final String id;

	public SongDigest(String id)
	{
		this.id = id;
	}

	public String getSongId()
	{
		return id;
	}

	public String getSongName()
	{
		return Shorty.isVoid(id) ? EMPTY_REPLACMENT : id;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (!(o instanceof SongDigest)) return false;

		SongDigest that = (SongDigest) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;

		return true;
	}

	@Override
	public int hashCode()
	{
		return id != null ? id.hashCode() : 0;
	}

	public <R> R accept(InstanceVisitor<R> visitor)
	{
		return visitor.visit(this);
	}
}