package com.github.charlyb01.music_control.config;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;

@Config(name = "music_control")
public class ModConfig implements ConfigData {
    @ConfigEntry.BoundedDiscrete(min = 1, max = 300)
    public int timer = 15;

    public boolean print = true;

    public boolean cheat = false;

    public static ModConfig get() {
        return AutoConfig.getConfigHolder(ModConfig.class).getConfig();
    }
}
