package org.peakimo.factionchat;

import org.bukkit.plugin.java.JavaPlugin;
import org.peakimo.factionchat.Commands.Chat;

public final class FactionChat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("f").setExecutor(new Chat());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
