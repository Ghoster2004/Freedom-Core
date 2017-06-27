package com.corbis.freedomcore.moderation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BanCommand implements CommandExecutor{

    @SuppressWarnings("deprecation")
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if(sender instanceof Player) {
    		if(cmd.getName().equalsIgnoreCase("ban")) {
    			Player p = (Player) sender;
    			Player t = Bukkit.getPlayer(args[0]);
    			if(p.hasPermission("freedom.admin")) {
    				if(args.length < 2) {
    					p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
    				}
    				else if(args.length == 2) {
    					t.setBanned(true);
    					t.kickPlayer("You have been banned! Reason: " + args[1]);
    				}else{
    					p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /ban (player) (reason)");
    				}
    			}else{
    				p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
    			}
    		}	
    	}
    	return false;
   	}
	
}
