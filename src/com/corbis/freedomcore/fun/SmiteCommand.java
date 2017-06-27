package com.corbis.freedomcore.fun;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SmiteCommand implements CommandExecutor{

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("smite")) {
				Player p = (Player) sender;
				Player t = Bukkit.getPlayer(args[0]);
				if(p.hasPermission("freedom.superadmin")) {
					t.getWorld().strikeLightning(t.getLocation());
					t.sendMessage(ChatColor.RED + "[Freedom] You have been smited!");
					p.sendMessage(ChatColor.RED + "[Freedom] " + t.getName() + " has been smited!");
				}else{
					p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
				}
			}
		}
		return false;
	}
	
}
