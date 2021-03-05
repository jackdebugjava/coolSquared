package io.github.jackdebugjava;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class amigay implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("amigay")) { // If the player typed /amigay then do the following
			Player player=Bukkit.getPlayer(label);
			player.sendMessage(ChatColor.GREEN + "yes");
		}
		return false;
	}
}
