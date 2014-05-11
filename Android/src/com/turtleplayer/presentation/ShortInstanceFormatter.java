/**
 * @author Phan Van Trung
 */

package com.turtleplayer.presentation;

import com.turtleplayer.model.*;

class ShortInstanceFormatter extends InstanceFormatter
{
    public String visit(Track track)
    {
        return track.getSongName();
    }

	public String visit(SongDigest track)
	{
		return track.getSongName();
	}

	public String visit(Album album)
    {
        return album.getAlbumName();
    }

	public String visit(GenreDigest genre)
	{
		return genre.getGenreName();
	}

	public String visit(ArtistDigest artist)
	{
		return artist.getArtistName();
	}

	public String visit(FSobject FSobject)
	{
		return FSobject.getName();
	}
}
