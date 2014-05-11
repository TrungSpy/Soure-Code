package com.turtleplayer.persistance.turtle.filter;

import com.turtleplayer.model.Track;
import com.turtleplayer.persistance.framework.filter.*;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

/**
 * @author Phan Van Trung
 */

public class DirFilter extends FieldFilter<Tables.FsObjects, Track, String>
{
	/**
	 * @param operator
	 * @param value should be in form /dir1/dir2/
	 */
	public DirFilter(Operator operator,
						  String value)
	{
		super(Tables.Dirs.PATH, operator, value);
	}

	public boolean filtersInPath(String filter)
	{
		return value.startsWith(filter);
	}

	@Override
	public <R> R accept(FilterVisitor<? extends Tables.FsObjects, R> visitor)
	{
		return visitor instanceof TurtleFilterVisitor ? ((TurtleFilterVisitor<? extends Tables.FsObjects, R>)visitor) .visit(this) : visitor.visit(this);
	}

	public String getValueWithoutWildcards()
	{
		String result = getValue();
		if (result.length() > 0 && result.charAt(result.length() - 1) == '%') {
			result = result.substring(0, result.length()-1);
		}
		if (result.length() > 0 && result.charAt(0) == '%') {
			result = result.substring(1, result.length());
		}
		return result;
	}
}
