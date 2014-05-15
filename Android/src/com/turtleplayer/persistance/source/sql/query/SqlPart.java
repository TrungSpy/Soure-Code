package com.turtleplayer.persistance.source.sql.query;

import java.util.List;

/**
 * @author Phan Van Trung
 */

public interface SqlPart extends SqlFragment
{
	List<Object> getParams();
}
