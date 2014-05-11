package com.turtleplayer.persistance.framework.creator;

/**
 * @author Phan Van Trung
 */

public interface Creator<RESULT, SOURCE>
{
	RESULT create(SOURCE source);
}