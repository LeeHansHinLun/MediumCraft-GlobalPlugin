package net.LeeHansHinLun.MediumCraft.MainPlugin;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import net.LeeHansHinLun.MediumCraft.MainPlugin.Commands.MediumCraftCommand;
import net.LeeHansHinLun.MediumCraft.MainPlugin.Events.MediumCraftEvents;

public class MediumCraft extends JavaPlugin {
	
	@Override
	public void onEnable() {
		registerNewEvents(new MediumCraftEvents());
		getCommand("mediumcraft").setExecutor(new MediumCraftCommand());
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[MediumCraft]: Enabled plugin MediumCraft!");
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "[MediumCraft]: Disabled plugin MediumCraft!");
	}
	
	public void registerNewEvents(Listener event) {
		getServer().getPluginManager().registerEvents(event, this);
	}
	
}
