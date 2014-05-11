package com.turtleplayer.persistance.source.relational.fieldtype;

import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.source.relational.FieldPersistable;

/**
 * @author Phan Van Trung
 */

public class FieldPersistableAsInteger<RESULT> extends FieldPersistable<RESULT, Integer>
{
	public FieldPersistableAsInteger(String name,
													Creator<Integer, RESULT> mapping)
	{
		super(name, mapping);
	}

	public FieldPersistableAsInteger(FieldPersistable<RESULT, Integer> fieldPersistable)
	{
		super(fieldPersistable);
	}

	@Override
	public <R> R accept(FieldVisitor<R, ? extends RESULT> visitor)
	{
		return visitor.visit(this);
	}
}
