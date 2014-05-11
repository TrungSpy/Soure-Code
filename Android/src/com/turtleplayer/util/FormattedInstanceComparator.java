/**
 * @author Phan Van Trung
 */

package com.turtleplayer.util;

import com.turtleplayer.model.*;
import com.turtleplayer.presentation.InstanceFormatter;

import java.text.Collator;
import java.util.Comparator;

public class FormattedInstanceComparator implements Comparator<Instance>
{
	private final InstanceFormatter listInstanceFormatter;



	public FormattedInstanceComparator(InstanceFormatter listInstanceFormatter)
	{
		this.listInstanceFormatter = listInstanceFormatter;
	}

	public int compare(Instance lhs,
							 Instance rhs)
	{
		int lhsWeight = getOrderWeight(lhs);
		int rhsWeight = getOrderWeight(rhs);
		int weightDiff = new Integer(lhsWeight).compareTo(rhsWeight);
		return weightDiff != 0 ? weightDiff :
				  Collator.getInstance().compare(lhs.accept(listInstanceFormatter), rhs.accept(listInstanceFormatter));
	}

	private int getOrderWeight(Instance instance)
	{
		return instance.accept(new InstanceVisitor<Integer>()
		{
			public Integer visit(Track track)
			{
				return 5;
			}

			public Integer visit(SongDigest track)
			{
				return 5;
			}

			public Integer visit(Album album)
			{
				return 4;
			}

			public Integer visit(GenreDigest genre)
			{
				return 2;
			}

			public Integer visit(ArtistDigest artist)
			{
				return 3;
			}

			public Integer visit(FSobject FSobject)
			{
				return 1;
			}
		});
	}
}
