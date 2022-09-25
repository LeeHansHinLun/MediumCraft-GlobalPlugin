package net.LeeHansHinLun.MediumCraft.MainPlugin.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MediumCraftEvents implements Listener {
	
	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to MediumCraft!");
	}
	
}
