package com.corbis.freedomcore.moderation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RlCommand implements CommandExecutor{

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("rl")) {
				Player p = (Player) sender;
				if(p.hasPermission("freedom.superadmin")) {
					p.sendMessage(ChatColor.RED + "[Freedom] Reloading the server!");
					Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "reload");
				}else{
					p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
				}
			}
		}
		return false;
	}
	
}
