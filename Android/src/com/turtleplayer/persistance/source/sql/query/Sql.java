package com.turtleplayer.persistance.source.sql.query;

import com.turtleplayer.persistance.source.relational.Field;

/**
 * @author Phan Van Trung
 */

public interface Sql extends SqlPart
{
	public static final Field FIELD_PSEUDO_STAR = new Field("*");
}
