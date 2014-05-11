package com.turtleplayer.util;

import android.content.Context;

/**
 * @author Phan Van Trung
 */

public class AndroidUtils
{

	/**
	 * @return null if not existing
	 */
	public static String getResourceString(Context context, String name) {

		int nameResourceID = context.getResources().getIdentifier(name, "string", context.getApplicationInfo().packageName);

		if (nameResourceID == 0)
		{
			return null;
		}
		else
		{
			return context.getString(nameResourceID);
		}
	}

	/**
	 * @return string of fallBackRessource param if not existing
	 */
	public static String getResourceString(Context context, String name, int fallBackRessource) {
		String string = getResourceString(context, name);
		return string == null ? context.getString(fallBackRessource) : string;
	}
}
