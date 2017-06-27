package com.corbis.freedomcore.player;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmspCommand implements CommandExecutor{

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("gmsp")) {
				Player p = (Player) sender;
				if(args.length == 0) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
				}else{
					p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /gmsp");
				}
			}
		}
		return false;
	}
	
}
