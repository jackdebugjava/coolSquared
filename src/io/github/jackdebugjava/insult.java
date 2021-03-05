package io.github.jackdebugjava;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class insult implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	Player p = (Player) sender;
    	String play = args.toString();
    	Player p2 = Bukkit.getPlayer(play);
		if (cmd.getName().equalsIgnoreCase("insult")) { // If the player typed /amigay then do the following
			if (args.length == 0){
                p.sendMessage(ChatColor.RED + "Correct usage: /insult <player>");
                return false;
            }
            if (args.length >= 1){
    			p.sendMessage(ChatColor.GREEN + "Sending an insult to " + p2);
                p2.sendMessage(ChatColor.BLUE + "" + p + " has INSULTED YOU! Type /insult " + p + " to insult them back!");
                return true;
            }
		}
		return false;
	}
}
