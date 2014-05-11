/**
 * @author Phan Van Trung
 */

package com.turtleplayer.presentation;

import com.turtleplayer.model.Track;
import com.turtleplayer.util.Shorty;

class ShortWithNumberInstanceFormatter extends ShortInstanceFormatter
{
    @Override
    public String visit(Track track)
    {
        String trackName = track.getSongName();

        int number = track.GetNumber();

        if(!Shorty.isVoid(number))
        {
            return number + DELIMITER + trackName;
        }
        return  trackName;
    }
}
