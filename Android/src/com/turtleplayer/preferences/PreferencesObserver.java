/**
 * @author Phan Van Trung
 */

package com.turtleplayer.preferences;

import com.turtleplayer.controller.Observer;

public interface PreferencesObserver  extends Observer
{
	void changed(AbstractKey<?, ?> key);
}
