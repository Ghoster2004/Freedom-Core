package com.corbis.freedomcore.player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor{

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if(sender instanceof Player) {
    		if(cmd.getName().equalsIgnoreCase("gamemode")) {
    			Player p = (Player) sender;
    			Player t = Bukkit.getPlayer(args[1]);
    			if(args.length == 0) {
    				p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /gamemode (gamemode) (player)");
    			}
    			else if(args.length == 1) {
    				if(args[0].equalsIgnoreCase("creative")) {
    					p.setGameMode(GameMode.CREATIVE);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("c")) {
    					p.setGameMode(GameMode.CREATIVE);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("1")) {
    					p.setGameMode(GameMode.CREATIVE);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("survival")) {
    					p.setGameMode(GameMode.SURVIVAL);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("s")) {
    					p.setGameMode(GameMode.SURVIVAL);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("0")) {
    					p.setGameMode(GameMode.SURVIVAL);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("adventure")) {
    					p.setGameMode(GameMode.ADVENTURE);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("a")) {
    					p.setGameMode(GameMode.ADVENTURE);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("2")) {
    					p.setGameMode(GameMode.ADVENTURE);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("spectator")) {
    					p.setGameMode(GameMode.SPECTATOR);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("sp")) {
    					p.setGameMode(GameMode.SPECTATOR);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}
    				else if(args[0].equalsIgnoreCase("3")) {
    					p.setGameMode(GameMode.SPECTATOR);
    					p.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
    				}else{
    					p.sendMessage(ChatColor.RED + "[Freedom] Please enter a valid gamemode!");
    				}
    			}
    			else if(args.length == 2) {
    				if(p.hasPermission("freedom.admin")) {
        				if(args[0].equalsIgnoreCase("creative")) {
        					t.setGameMode(GameMode.CREATIVE);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("c")) {
        					t.setGameMode(GameMode.CREATIVE);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("1")) {
        					t.setGameMode(GameMode.CREATIVE);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("survival")) {
        					t.setGameMode(GameMode.SURVIVAL);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("s")) {
        					t.setGameMode(GameMode.SURVIVAL);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("0")) {
        					t.setGameMode(GameMode.SURVIVAL);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("adventure")) {
        					t.setGameMode(GameMode.ADVENTURE);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("a")) {
        					t.setGameMode(GameMode.ADVENTURE);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("2")) {
        					t.setGameMode(GameMode.ADVENTURE);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("spectator")) {
        					t.setGameMode(GameMode.SPECTATOR);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("sp")) {
        					t.setGameMode(GameMode.SPECTATOR);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}
        				else if(args[0].equalsIgnoreCase("3")) {
        					t.setGameMode(GameMode.SPECTATOR);
        					t.sendMessage(ChatColor.RED + "[Freedom] Your gamemode has been updated!");
        					p.sendMessage(ChatColor.RED + "[Freedom] Their gamemode has been updated!");
        				}else{
        					t.sendMessage(ChatColor.RED + "[Freedom] Please enter a valid gamemode!");
        				}
    				}else{
    					p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
    				}
    			}else{
    				p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /gamemode (gamemode) (player)");
    			}
    		}
    	}
		return false;
	}
	
}
