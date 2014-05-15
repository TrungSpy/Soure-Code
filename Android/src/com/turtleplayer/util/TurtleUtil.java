package com.turtleplayer.util;

import com.turtleplayer.R;
import com.turtleplayer.TurtlePlayer;

/**
 * @author Phan Van Trung
 */

public class TurtleUtil
{
	private static final String RES_GENRE_PREFIX = "tag.genre.";

	public static String translateGenreId(String id){

		if(Shorty.isVoid(id.trim())){
			return TurtlePlayer.getStaticInstance().getString(R.string.tag_genre_unknown);
		}

		try
		{
			return AndroidUtils.getResourceString(
					  TurtlePlayer.getStaticInstance(),
					  RES_GENRE_PREFIX + Integer.parseInt(id),
					  R.string.tag_genre_unknown);
		}
		catch (NumberFormatException nfe)
		{
			return id.trim();
		}
	}

	public static String getLastPartOfPath(String path)
	{
		// "/path/path/file/"

		if(path.lastIndexOf('/') == path.length()-1)
		{
			path = path.substring(0, path.length()-1);
		}

		// "/path/path/file"

		return path.substring(path.lastIndexOf('/')+1);

		// "file"
	}
}
