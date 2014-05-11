package com.turtleplayer.model;

/**
 * @author Phan Van Trung
 */

public class AlbumArtLocation
{
	private final String path;
	private final String albumArtpath;

	public AlbumArtLocation(String path,
									String albumArtpath)
	{
		this.path = path;
		this.albumArtpath = albumArtpath;
	}

	public String getPath()
	{
		return path;
	}

	public String getAlbumArtpath()
	{
		return albumArtpath;
	}
}
