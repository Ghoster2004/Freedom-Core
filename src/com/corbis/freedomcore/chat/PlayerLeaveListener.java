package com.corbis.freedomcore.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerLeaveListener implements Listener{
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage(ChatColor.BLACK + "[" + ChatColor.RED + "-" + ChatColor.BLACK + "]" + ChatColor.RESET + " " + ChatColor.YELLOW + p.getName());
	}

}
