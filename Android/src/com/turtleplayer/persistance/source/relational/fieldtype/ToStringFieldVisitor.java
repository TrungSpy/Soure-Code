package com.turtleplayer.persistance.source.relational.fieldtype;

/**
 * @author Phan Van Trung
 */

public class ToStringFieldVisitor<RESULT> implements  FieldVisitor<String, RESULT>
{
	final RESULT result;

	public ToStringFieldVisitor(RESULT result)
	{
		this.result = result;
	}

	public String visit(FieldPersistableAsString<? super RESULT> field)
	{
		return field.get(result);
	}

	public String visit(FieldPersistableAsDouble<? super RESULT> field)
	{
		return field.get(result).toString();
	}

	public String visit(FieldPersistableAsInteger<? super RESULT> field)
	{
		return field.get(result).toString();
	}
}
