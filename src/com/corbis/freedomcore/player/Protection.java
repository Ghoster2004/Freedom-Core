package com.corbis.freedomcore.player;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Protection implements Listener{
	
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		
		if(p.hasPermission("freedom.superadmin")) {
			e.setCancelled(false);
		}else{
			if(e.getBlockPlaced().getType() == Material.TNT) {
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] You are not permitted to interact with Tnt!");
			}
			else if(e.getBlockPlaced().getType() == Material.LAVA) {
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] You are not permitted to interact with Lava!");
			}
			else if(e.getBlockPlaced().getType() == Material.DISPENSER) {
				e.setCancelled(true);
				p.sendMessage(ChatColor.RED + "[Freedom] You are not permitted to interact with Dispenser!");
			}else{
				e.setCancelled(false);
			}
		}
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(p.hasPermission("freedom.superadmin")) {
			e.setCancelled(false);
		}else{
			if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {
				if(e.getMaterial() == Material.FLINT_AND_STEEL) {
					e.setCancelled(true);
					p.sendMessage(ChatColor.RED + "[Freedom] You are not permitted to interact with Flint and Steel!");
				}
				else if(e.getMaterial() == Material.FIREBALL) {
					e.setCancelled(true);
					p.sendMessage(ChatColor.RED + "[Freedom] You are not permitted to interact with Fire Charge!");
				}
				else if(e.getMaterial() == Material.LAVA_BUCKET) {
					e.setCancelled(true);
					p.sendMessage(ChatColor.RED + "[Freedom] You are not permitted to interact with Lava!");
				}else{
					e.setCancelled(false);
				}
			}
		}
	}

}
