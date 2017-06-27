package com.corbis.freedomcore.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.md_5.bungee.api.ChatColor;

public class PlayerJoinListener implements Listener{

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		e.setJoinMessage(ChatColor.BLACK + "[" + ChatColor.GREEN + "+" + ChatColor.BLACK + "]" + ChatColor.RESET + " " + ChatColor.YELLOW + p.getName());
		if(p.isOp() == true) {
			p.sendMessage(ChatColor.RED + "[Freedom] Welcome back to the server!");
		}else{
			p.setOp(true);
			if(p.getFirstPlayed() == p.getLastPlayed()) {
				p.sendMessage(ChatColor.RED + "[Freedom] Welcome to the server!");
			}else{
				p.sendMessage(ChatColor.RED + "[Freedom] Welcome back to the server!");
			}
		}
	}
	
}
