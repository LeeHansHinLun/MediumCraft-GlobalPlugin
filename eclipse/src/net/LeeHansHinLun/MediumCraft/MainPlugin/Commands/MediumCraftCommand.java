package net.LeeHansHinLun.MediumCraft.MainPlugin.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.LeeHansHinLun.MediumCraft.MainPlugin.Storage;
import net.LeeHansHinLun.MediumCraft.MainPlugin.Resources.RandomString;

public class MediumCraftCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player;
		RandomString session = new RandomString();
		if (sender instanceof Player) {
			player = (Player) sender;
		}
		else {
			// Stuff for console
			return true;
		}
		
		if (command.getName().equalsIgnoreCase("mediumcraft")) {
			player.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Medium" + ChatColor.GREEN + "Craft" + ChatColor.WHITE + "] " + ChatColor.BLUE + "You are connected to SurvivalMultiplayer at MediumCraft!");
			return true;
		}
		
		return true;
	}
	
	public boolean sendMessageToPlayerWithMediumCraftHeader(Player player, String message) {
		try {
			player.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Medium" + ChatColor.GREEN + "Craft" + ChatColor.WHITE + "] " + message);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
