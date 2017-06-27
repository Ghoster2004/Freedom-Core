package com.corbis.freedomcore.moderation;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class ReloadDisabler implements Listener{

	@EventHandler
	public void onReload(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		String label = e.getMessage();
		if(label.contains("/reload")) {
			if(p.hasPermission("freedom.superadmin")) {
				e.setCancelled(false);
			}else{
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
			}
		}
		else if(label.contains("/kill")) {
			if(p.hasPermission("freedom.superadmin")) {
				e.setCancelled(false);
			}else{
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
			}
		}
	}
	
}
