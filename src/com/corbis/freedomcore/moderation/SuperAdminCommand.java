package com.corbis.freedomcore.moderation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuperAdminCommand implements CommandExecutor {

	   @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		   if(sender instanceof Player) {
			   if(cmd.getName().equalsIgnoreCase("admin")) {
				   Player p = (Player) sender;
				   Player t = Bukkit.getPlayer(args[0]);
				   if(args.length == 1) {
					   if(p.hasPermission("freedom.superadmin")) {
						   p.getServer().dispatchCommand(p.getServer().getConsoleSender(), "manuaddp " + t.getName() + " freedom.superadmin");
						   p.sendMessage(ChatColor.RED + "[Freedom] " + t.getName() + " has been given admin!");
					   }else{
							   p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
					   }
				   }else{
					   p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /admin (player)");
				   }
			   }
		   }else{
			   if(cmd.getName().equalsIgnoreCase("admin")) {
				   Player t = Bukkit.getPlayer(args[0]);
				   t.getServer().dispatchCommand(t.getServer().getConsoleSender(), "manuaddp " + t.getName() + " freedom.superadmin");
			   }
		   }
		return false;
	   }
	
}
