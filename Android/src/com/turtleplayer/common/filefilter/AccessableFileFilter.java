/**
 * @author Phan Van Trung
 */

package com.turtleplayer.common.filefilter;


import java.io.File;
import java.io.FilenameFilter;

public abstract class AccessableFileFilter implements FilenameFilter
{
	public boolean accept(File dir,
								 String filename)
	{
		return true; //TODO; accept readable
	}
}
