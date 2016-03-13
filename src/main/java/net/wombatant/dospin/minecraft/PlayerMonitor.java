/*
 * Copyright 2016 gtalent2@gmail.com
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.wombatant.dospin.minecraft;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 */
public class PlayerMonitor extends JavaPlugin {

    public class PlayerListener implements Listener {

        private PlayerMonitor plugin;

        public PlayerListener(final PlayerMonitor instance) {
            plugin = instance;
        }

        @EventHandler
        public void onPlayerMove(final PlayerMoveEvent event) {
        }

    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onEnable() {
        final PluginManager pm = this.getServer().getPluginManager();
        this.getServer().getOnlinePlayers();
    }
}
