/**
 * @author Phan Van Trung
 */

package com.turtleplayer.model;

public interface InstanceVisitor<R>
{
	R visit(Track track);

	R visit(SongDigest track);

	R visit(Album album);

	R visit(GenreDigest genre);

	R visit(ArtistDigest artist);

	R visit(FSobject FSobject);
}
