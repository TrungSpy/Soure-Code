/**
 * @author Phan Van Trung
 */

package com.turtleplayer.presentation;

import com.turtleplayer.model.*;
import com.turtleplayer.util.Shorty;
import com.turtleplayer.util.TurtleUtil;

class OverAllFormatter extends InstanceFormatter
{

	public String visit(Track track)
	{
		String artist = track.GetArtist().getArtistName();
		int number = track.GetNumber();
		String title = track.getSongName();

		if(!Shorty.isVoid(artist) && !Shorty.isVoid(title))
		{
			StringBuilder label = new StringBuilder();
			if(number > 0){
				label.append(number).append(DELIMITER);
			}
			label.append(artist).append(DELIMITER);
			label.append(title);
			return label.toString();
		}
		else
		{
			return TurtleUtil.getLastPartOfPath(track.getAlbumName());
		}

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
		return FSobject.getPath();
	}
}
