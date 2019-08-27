/*
 * OutputPreference.
 *
 * JavaZOOM : jlgui@javazoom.net
 *            http://www.javazoom.net
 *
 *-----------------------------------------------------------------------
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published
 *   by the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this program; if not, write to the Free Software
 *   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *----------------------------------------------------------------------
 */
package ru.javabegin.training.l2_jlgui.player.util.ui;

import java.util.ResourceBundle;
import javax.swing.border.TitledBorder;

public class OutputPreference extends PreferenceItem
{
    private static OutputPreference instance = null;

    private OutputPreference()
    {
    }

    public static OutputPreference getInstance()
    {
        if (instance == null)
        {
            instance = new OutputPreference();
        }
        return instance;
    }

    @Override
    public void loadUI()
    {
        if (loaded == false)
        {
            bundle = ResourceBundle.getBundle("ru/javabegin/training/l2_jlgui/player/util/ui/output");
            setBorder(new TitledBorder(getResource("title")));
            loaded = true;
        }
    }
}
