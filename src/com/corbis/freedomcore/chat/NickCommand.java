package com.corbis.freedomcore.chat;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (sender instanceof Player) {
    		if(cmd.getName().equalsIgnoreCase("nick")) {
    			Player p = (Player) sender;
    			p.sendMessage(ChatColor.RED + "[Freedom] This command is in development!");
    		}
    	}
		return false;
    }
	
}