/**
 * @author Phan Van Trung
 */

package com.turtleplayer.common.filefilter;

import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

public interface FileFilters
{
	final static List<? extends FilenameFilter> PLAYABLE_FILES_FILTER = Arrays.asList(
			  new NameFilter(".*.mp3", ".*.ogg")
	);

	final static List<? extends FilenameFilter> folderArtFilters = Arrays.asList(
			  new NameFilter("folder.jpg"),
			  new NameFilter(".*front.*.jpg", ".*front.*.jpeg", ".*front.*.gif"),
			  new NameFilter(".*cover.*.jpg", ".*cover.*.jpeg", ".*cover.*.gif"),
			  new NameFilter(".*.jpg", ".*.jpeg", ".*.gif")
	);
}