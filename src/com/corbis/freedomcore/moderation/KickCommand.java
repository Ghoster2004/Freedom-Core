package com.corbis.freedomcore.moderation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KickCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if(sender instanceof Player) {
    		if(cmd.getName().equalsIgnoreCase("kick")) {
    			Player p = (Player) sender;
    			Player t = Bukkit.getPlayer(args[0]);
    			if(args.length == 2) {
        			if(p.hasPermission("freedom.admin")) {
        				t.kickPlayer("You have been kicked! Reason: " + args[1]);
        				p.sendMessage(ChatColor.RED + "[Freedom] " + ChatColor.YELLOW + t.getName() + ChatColor.RED + " has been kicked for " + ChatColor.BLUE + args[1] + ChatColor.RED + "!");
        			}else{
        				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
        			}
    			}else{
    				p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /kick (player) (reason)");
    			}
    		}
    	}
    	return false;
    }
	
}
