package com.turtleplayer.controller;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.turtleplayer.player.Output;
import com.turtleplayer.player.OutputAccess;
import com.turtleplayer.player.OutputCommand;

/**
 * @author Phan Van Trung
 */

public class PhoneStateHandler extends PhoneStateListener
{
	private final OutputAccess outputAccess;

	private boolean wasPlaying = false;

	public PhoneStateHandler(OutputAccess outputAccess)
	{
		this.outputAccess = outputAccess;
	}

	@Override
	public void onCallStateChanged(int state,
											 String incomingNumber)
	{
		OutputCommand outputCommand = null;
		if (state == TelephonyManager.CALL_STATE_RINGING)
		{
			outputCommand = new OutputCommand()
			{
				public void connected(Output output)
				{
					wasPlaying = output.pause();
				}
			};
		}
		else if (state == TelephonyManager.CALL_STATE_IDLE)
		{
			if(wasPlaying)
			{
				outputCommand = new OutputCommand()
				{
					public void connected(Output output)
					{
						output.play();
					}
				};
			}
		}
		if(outputCommand != null)
		{
			outputAccess.connectPlayer(outputCommand);
		}
		super.onCallStateChanged(state, incomingNumber);
	}
}
