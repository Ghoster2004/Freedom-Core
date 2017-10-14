package com.corbis.freedomcore.moderation;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class ClearinventoryDisabler implements Listener{

	@EventHandler
	public void onReload(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		String label = e.getMessage();
		if(label.contains("/clearinventory")) {
			if(p.hasPermission("freedom.superadmin")) {
				e.setCancelled(false);
			}else{
				if(label.equalsIgnoreCase("/clearinventory")) {
					e.setCancelled(false);
				}else{
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
				}
			}
		}
		if(label.contains("/ci")) {
			if(p.hasPermission("freedom.superadmin")) {
				e.setCancelled(false);
			}else{
				if(label.equalsIgnoreCase("/ci")) {
					e.setCancelled(false);
				}else{
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
				}
			}
		}
	}
	
}
