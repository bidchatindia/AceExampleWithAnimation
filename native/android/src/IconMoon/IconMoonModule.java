package com.rahulverlekar.nativelist.IconMoon;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

/**
 * Created by abhik on 22-11-2016.
 */

public class IconMoonModule implements IconFontDescriptor {
    @Override
    public String ttfFileName() {
        return "icomoon.ttf";
    }

    @Override
    public Icon[] characters() {
        return IconMoonIcons.values();
    }
}
