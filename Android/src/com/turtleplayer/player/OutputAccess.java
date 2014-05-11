package com.turtleplayer.player;

/**
 * @author Phan Van Trung
 */

public interface OutputAccess
{
	public void connectPlayer(final OutputCommand outputCommand);

	public void releasePlayer();
}
