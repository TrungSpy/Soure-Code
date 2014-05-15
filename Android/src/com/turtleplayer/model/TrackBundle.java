package com.turtleplayer.model;

/**
 * @author Phan Van Trung
 */

public class TrackBundle
{
	private final Track track;
	private final Track trackAfter;
	private final Track trackBefore;

	/**
	 * Empty Track Bundle
	 */
	public TrackBundle()
	{
		this.track = null;
		this.trackAfter = null;
		this.trackBefore = null;
	}

	/**
	 * @param track can be null
	 * @param trackAfter can be null
	 * @param trackBefore can be null
	 */
	public TrackBundle(Track track,
							 Track trackAfter,
							 Track trackBefore)
	{
		this.track = track;
		this.trackAfter = trackAfter;
		this.trackBefore = trackBefore;
	}

	/**
	 * @return null if not available
	 */
	public Track getTrackBefore()
	{
		return trackBefore;
	}

	/**
	 * @return null if not available
	 */
	public Track getTrack()
	{
		return track;
	}

	/**
	 * @return null if not available
	 */
	public Track getTrackAfter()
	{
		return trackAfter;
	}
}
