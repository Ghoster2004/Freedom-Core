package com.corbis.fredomcore;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.corbis.freedomcore.chat.NickCommand;
import com.corbis.freedomcore.chat.PlayerJoinListener;
import com.corbis.freedomcore.chat.PlayerLeaveListener;
import com.corbis.freedomcore.moderation.AdminCommand;
import com.corbis.freedomcore.moderation.BanCommand;
import com.corbis.freedomcore.moderation.KickCommand;
import com.corbis.freedomcore.moderation.ReloadDisabler;
import com.corbis.freedomcore.moderation.RlCommand;
import com.corbis.freedomcore.moderation.SuperAdminCommand;
import com.corbis.freedomcore.player.FlyCommand;
import com.corbis.freedomcore.player.GamemodeCommand;
import com.corbis.freedomcore.player.GmCommand;
import com.corbis.freedomcore.player.GmaCommand;
import com.corbis.freedomcore.player.GmcCommand;
import com.corbis.freedomcore.player.GmsCommand;
import com.corbis.freedomcore.player.GmspCommand;
import com.corbis.freedomcore.player.Protection;

public class Main extends JavaPlugin implements Listener, CommandExecutor{
	ArrayList<Player> frozen = new ArrayList<Player>();
	
	public void onEnable() {
		registerEvents();
		registerCommands();
		getConfig().options().copyDefaults(true);
		saveConfig();
		saveDefaultConfig();
	}
	
	public void onDisable() {
		
	}
	
	public void registerEvents() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
		getServer().getPluginManager().registerEvents(new PlayerLeaveListener(), this);
		getServer().getPluginManager().registerEvents(new Protection(), this);
		getServer().getPluginManager().registerEvents(new ReloadDisabler(), this);
	}
	
	public void registerCommands() {
		this.getCommand("nick").setExecutor(new NickCommand());
		this.getCommand("kick").setExecutor(new KickCommand());
		this.getCommand("admin").setExecutor(new AdminCommand());
		this.getCommand("superadmin").setExecutor(new SuperAdminCommand());
		this.getCommand("ban").setExecutor(new BanCommand());
		this.getCommand("fly").setExecutor(new FlyCommand());
		this.getCommand("gamemode").setExecutor(new GamemodeCommand());
		this.getCommand("gm").setExecutor(new GmCommand());
		this.getCommand("gms").setExecutor(new GmsCommand());
		this.getCommand("gmc").setExecutor(new GmcCommand());
		this.getCommand("gma").setExecutor(new GmaCommand());
		this.getCommand("gmsp").setExecutor(new GmspCommand());
		this.getCommand("rl").setExecutor(new RlCommand());
	}
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(cmd.getName().equalsIgnoreCase("freeze")) {
				Player p = (Player) sender;
				Player t = Bukkit.getPlayer(args[0]);
				if(args.length == 0) {
					p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /freeze (player)");
				}
				else if(args.length == 1) {
					if(p.hasPermission("freedom.admin")) {
						if(frozen.contains(t)) {
							frozen.remove(t);
							p.sendMessage(ChatColor.RED + "[Freedom] " + t.getName() + " has been unfrozen!");
						}else{
							frozen.add(t);
							p.sendMessage(ChatColor.RED + "[Freedom] " + t.getName() + " has been frozen!");
						}
					}else{
						p.sendMessage(ChatColor.RED + "[Freedom] No permission!");
					}
				}else{
					p.sendMessage(ChatColor.RED + "[Freedom] Correct usage: /freeze (player)");
				}
			}
		}
		return false;
	}
	
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		if(frozen.contains(e.getPlayer())) {
		e.setTo(e.getFrom());
		e.getPlayer().sendMessage(ChatColor.RED + "[Freedom] You are currently frozen and cannot move!");
		}else{
			e.setCancelled(false);
		}
	}
	
	public void onWeatherChange(WeatherChangeEvent e) {
		World world = e.getWorld();
		world.setStorm(false);
		world.setThundering(false);
	}
	
}
