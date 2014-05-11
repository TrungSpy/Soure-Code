package com.turtleplayer.persistance.source.relational.fieldtype;

import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.source.relational.FieldPersistable;

/**
 * @author Phan Van Trung
 */

public class FieldPersistableAsString<RESULT> extends FieldPersistable<RESULT, String>
{
	public FieldPersistableAsString(String name,
												  Creator<String, RESULT> mapping)
	{
		super(name, mapping);
	}

	public FieldPersistableAsString(FieldPersistable<RESULT, String> fieldPersistable)
	{
		super(fieldPersistable);
	}

	@Override
	public <R> R accept(FieldVisitor<R, ? extends RESULT> visitor)
	{
		return visitor.visit(this);
	}
}
