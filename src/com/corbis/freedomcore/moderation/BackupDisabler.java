package com.corbis.freedomcore.moderation;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class BackupDisabler implements Listener{

	@EventHandler
	public void onReload(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		String label = e.getMessage();
		if(label.contains("/backup")) {
			if(p.hasPermission("freedom.superadmin")) {
				e.setCancelled(false);
			}else{
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
			}
		}
	}
	
}
