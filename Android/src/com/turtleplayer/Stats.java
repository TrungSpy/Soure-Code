/**
 * @author Phan Van Trung
 */
// Package
package com.turtleplayer;


public class Stats
{
	// ========================================= //
	// 	Attributes
	// ========================================= //

	private int totalPlayCount;


	// ========================================= //
	// 	Constructor
	// ========================================= //

	public Stats()
	{
		totalPlayCount = 0;
	}


	// ========================================= //
	// 	TotalPlayCount
	// ========================================= //

	public int GetTotalPlayCount()
	{
		return totalPlayCount;
	}

	public void SetTotalPlayCount(int nTotalPlayCount)
	{
		totalPlayCount = nTotalPlayCount;
	}

	public void IncrementPlayCount()
	{
		totalPlayCount++;
	}
}
