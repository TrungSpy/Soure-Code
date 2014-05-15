/**
 * @author Phan Van Trung
 */
package com.turtleplayer.model;

import com.turtleplayer.persistance.framework.creator.Creator;

public interface InstanceCreator<T extends Instance, S> extends Creator<T, S>
{
	T create(S source);
}
