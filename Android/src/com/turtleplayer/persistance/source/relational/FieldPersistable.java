package com.turtleplayer.persistance.source.relational;

import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.source.relational.fieldtype.FieldVisitor;

/**
 * @author Phan Van Trung
 */

public abstract class FieldPersistable<RESULT, TYPE> extends Field
{
	private final Creator<TYPE, RESULT> mapping;

	protected FieldPersistable(String name,
										Creator<TYPE, RESULT> mapping)
	{
		super(name);
		this.mapping = mapping;
	}

	public FieldPersistable(FieldPersistable<RESULT, TYPE> fieldPersistable)
	{
		this(fieldPersistable.getName(), fieldPersistable.mapping);
	}

	public TYPE get(RESULT type)
	{
		return mapping.create(type);
	}

	public abstract <R> R accept(FieldVisitor<R, ? extends RESULT> visitor);
}
