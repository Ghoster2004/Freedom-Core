package com.corbis.freedomcore.player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor{

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("fly")) {
				Player p = (Player) sender;
				Player t = Bukkit.getPlayer(args[0]);
				if(args.length == 0) {
					if(p.getAllowFlight() == false) {
						p.setAllowFlight(true);
						p.sendMessage(ChatColor.RED + "[Freedom] Flight enabled!");
					}
					else if(p.getAllowFlight() == true) {
						p.setAllowFlight(false);
						p.sendMessage(ChatColor.RED + "[Freedom] Flight disabled!");
					}
			    }
				else if(args.length == 1) {
					if(p.hasPermission("freedom.admin")) {
						if(t.isOnline() == true) {
							if(t.getAllowFlight() == false) {
								t.setAllowFlight(true);
								t.sendMessage(ChatColor.RED + "[Freedom] " + p.getName() + " has enabled your flight!");
								p.sendMessage(ChatColor.RED + "[Freedom] Enabled " + t.getName() + "'s flight!");
							}else{
								t.setAllowFlight(false);
								t.sendMessage(ChatColor.RED + "[Freedom] " + p.getName() + " has disabled your flight!");
								p.sendMessage(ChatColor.RED + "[Freedom] Disabled " + t.getName() + "'s flight!");
							}
						}else{
							p.sendMessage(ChatColor.RED + "[Freedom] The player specified is not online!");
						}
					}else{
						p.sendMessage(ChatColor.RED + "[Freedom] No permission to set other's flight!");
					}
				}else{
					if(p.hasPermission("freedom.admin")) {
						p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /fly (player)");
					}else{
						p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /fly");
					}
				}
			}
		}
		return false;
	}
	
}
