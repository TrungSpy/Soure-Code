package com.turtleplayer.persistance.framework;

import com.turtleplayer.persistance.source.relational.Field;

/**
 * @author Phan Van Trung
 */

public interface UniqueFieldGetter<I>
{
	Field getUniqueFields();
}
