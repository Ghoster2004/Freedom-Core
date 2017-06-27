package com.corbis.freedomcore.player;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmcCommand implements CommandExecutor{

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("gmc")) {
				Player p = (Player) sender;
				if(args.length == 0) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage(ChatColor.RED + "[Freedom] You gamemode has been updated!");
				}else{
					p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /gmc");
				}
			}
		}
		return false;
	}
	
}
