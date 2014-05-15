package com.turtleplayer.persistance.framework.paging;

import com.turtleplayer.persistance.framework.filter.*;
import com.turtleplayer.persistance.framework.sort.*;

/**
 * @author Phan Van Trung
 */

public abstract class Paging
{

	public static <RESULT, PROJECTION> Filter<? super PROJECTION> getFilter(Filter<? super PROJECTION> oldFilters,
										RESULT instance,
										Order<? super PROJECTION> order)
	{
		if(instance != null)
		{
			return new FilterSet<PROJECTION>(order.accept(new PagingFilterBuilder<PROJECTION, RESULT>(instance)), oldFilters);
		}
		else
		{
			return oldFilters;
		}
	}
}
