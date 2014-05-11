package com.turtleplayer.persistance.source.relational;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @author Phan Van Trung
 */

public interface View extends Serializable
{
	public Set<? extends Table> getTables();

	public List<Field> getFields();
}
