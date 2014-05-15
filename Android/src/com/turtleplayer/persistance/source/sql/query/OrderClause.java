package com.turtleplayer.persistance.source.sql.query;

/**
 * @author Phan Van Trung
 */

/**
 * Marker Interface
 */
public interface OrderClause extends SqlFragment, OrderClausePart
{
    OrderClause apply(OrderClause orderClause);
}
