package com.turtleplayer.persistance.source.sql.query;

/**
 * @author Phan Van Trung
 */

public class OrderClauseRandom implements OrderClause
{
	public String toSql()
	{
		return " RANDOM() ";
	}

    public OrderClause apply(OrderClause orderClause)
    {
        throw new RuntimeException("random order cant be chained");
    }
}
