package com.turtleplayer.persistance.source.relational.fieldtype;

import com.turtleplayer.persistance.framework.creator.Creator;
import com.turtleplayer.persistance.source.relational.FieldPersistable;

/**
 * @author Phan Van Trung
 */

public class FieldPersistableAsDouble<RESULT> extends FieldPersistable<RESULT, Double>
{
	public FieldPersistableAsDouble(String name,
												  Creator<Double, RESULT> mapping)
	{
		super(name, mapping);
	}

	public FieldPersistableAsDouble(FieldPersistable<RESULT, Double> fieldPersistable)
	{
		super(fieldPersistable);
	}

	@Override
	public <R> R accept(FieldVisitor<R, ? extends RESULT> visitor)
	{
		return visitor.visit(this);
	}
}
