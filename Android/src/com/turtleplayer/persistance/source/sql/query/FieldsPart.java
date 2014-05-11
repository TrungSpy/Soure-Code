package com.turtleplayer.persistance.source.sql.query;

import com.turtleplayer.persistance.source.relational.Field;

import java.util.List;

/**
 * @author Phan Van Trung
 */

public class FieldsPart implements SqlFragment
{
	private final List<? extends Field> fields;

	public FieldsPart(List<? extends Field> fields)
	{
		this.fields = fields;
	}

	public String toSql()
	{
		String[] fieldNames = new String[fields.size()];
		int i = 0;
		for(Field field : fields)
		{
			fieldNames[i++] = field.getName();
		}
		return Helper.getSeparatedList(", ", fieldNames);
	}
}
