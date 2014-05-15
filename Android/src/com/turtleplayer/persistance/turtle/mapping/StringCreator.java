package com.turtleplayer.persistance.turtle.mapping;

import android.database.Cursor;
import com.turtleplayer.persistance.framework.creator.Creator;

/**
 * @author Phan Van Trung
 */

/**
 * Creates a String based on a table entry, fields separated by the given separator
 */
public class StringCreator implements Creator<String, Cursor>
{
	final String separator;

	public StringCreator(String separator)
	{
		this.separator = separator;
	}

	public String create(Cursor source)
	{
		String string = "";

		for(int i = 0; i < source.getColumnCount(); i++){
			string += source.getString(i) + separator;
		}
		return string.length() > 0 ? string.substring(0, string.length() - separator.length()) : "";
	}
}
