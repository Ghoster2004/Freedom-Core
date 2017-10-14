package com.corbis.freedomcore.player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpAllCommand implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if(sender instanceof Player) {
    		if(cmd.getName().equalsIgnoreCase("opall")) {
    			Player p = (Player) sender;
    			for (Player players : Bukkit.getOnlinePlayers()) {
    				 players.setOp(true);
    				 p.sendMessage(ChatColor.RED + "[Freedom] All players have been opped!");
    				}
    		}
    	}
    	return false;
    }
	
}
