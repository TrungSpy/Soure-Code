package com.turtleplayer.persistance.framework.paging;

import com.turtleplayer.persistance.framework.filter.FieldFilter;
import com.turtleplayer.persistance.framework.filter.Filter;
import com.turtleplayer.persistance.framework.filter.FilterSet;
import com.turtleplayer.persistance.framework.filter.Operator;
import com.turtleplayer.persistance.framework.sort.*;
import com.turtleplayer.persistance.source.relational.FieldPersistable;

/**
 * @author Phan Van Trung
 */

public class PagingFilterBuilder<PROJECTION, RESULT> extends OrderVisitorGenerified<PROJECTION, RESULT, Object, Filter<? super PROJECTION>>
{
	final RESULT instance;

	public PagingFilterBuilder(RESULT instance)
	{
		this.instance = instance;
	}

	@Override
	public Filter<? super PROJECTION> visit(FieldOrder<PROJECTION, RESULT, Object> fieldOrder,
										 FieldPersistable<RESULT, Object> field)
	{
		final Operator op;

		switch(fieldOrder.getOrder()){
			case ASC:
				op = Operator.GT;
				break;
			case DESC:
				op = Operator.LT;
				break;
			default:
				throw new IllegalArgumentException();
		}
		return new FieldFilter<PROJECTION, RESULT, Object>(field, op, field.get(instance));
	}

//	public <T, Z> Filter visit(FieldOrder<PROJECTION, Z, T> fieldOrder)
//	{
//		FieldPersistable<RESULT, T> field = fieldOrder.getField();
//
//		final Operator op;
//
//		switch(fieldOrder.getOrder()){
//			case ASC:
//				op = Operator.GT;
//				break;
//			case DESC:
//				op = Operator.LT;
//				break;
//		   default:
//				throw new IllegalArgumentException();
//		}
//		return new FieldFilter<PROJECTION, RESULT, T>(field, op, field.get(instance));
//	}

	public Filter<? super PROJECTION> visit(RandomOrder<? super PROJECTION> orderFilter)
	{
		return null;
	}

	public Filter<? super PROJECTION> visit(OrderSet<? super PROJECTION> orderFilter)
	{
		if(!orderFilter.isEmpty()){
			Filter<? super PROJECTION> filterSet = new FilterSet<PROJECTION>();
			for( int i = 0; i < orderFilter.getOrders().size() -1; i++)
			{
				final Filter<? super PROJECTION> finalFilterSet = filterSet;
				filterSet = orderFilter.getOrders().get(i).accept(new OrderVisitorGenerified<PROJECTION, RESULT, Object, Filter<? super PROJECTION>>()
				{
					public Filter<? super PROJECTION> visit(RandomOrder<? super PROJECTION> orderFilter)
					{
						// :-)
						return null;
					}

					@Override
					public Filter<? super PROJECTION> visit(FieldOrder<PROJECTION, RESULT, Object> fieldOrder,
														 FieldPersistable<RESULT, Object> field)
					{
						return new FilterSet<PROJECTION>(
								  finalFilterSet,
								  new FieldFilter<PROJECTION, RESULT, Object>(fieldOrder.getField(), Operator.EQ, field.get(instance)));
					}

					public Filter<? super PROJECTION> visit(OrderSet<? super PROJECTION> orderFilter)
					{
						return this.visit(orderFilter);
					}
				});
			}

			return new FilterSet<PROJECTION>(filterSet, orderFilter.getOrders().get(orderFilter.getOrders().size()-1).accept(this));
		}
		else
		{
			return null;
		}
	}

}
