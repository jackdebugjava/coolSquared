package io.github.jackdebugjava;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class coolSquared extends JavaPlugin {
    @Override
    public void onEnable() {
    	this.getCommand("amigay").setExecutor(new amigay());
		getLogger().info("coolSquared is now activated!");
    }
    @Override
    public void onDisable() {
    	getLogger().info("coolSquared is now disabled, goodbye! :)");
    }
    @EventHandler // Listening for the event.
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer(); // Getting the player who sent the message.
        String message = event.getMessage().toLowerCase(); // Getting the message, and making it lowercase.
        for(String blockedWord : getConfig().getStringList("badwords")) { // Looping through all the blocked words in the string list.
            if(message.contains(blockedWord.toLowerCase())) { // If the message contains one or more blocked word
            	String messageOnSwear = (ChatColor.RED + "Uh oh! " + player + " has said a STINKY word! They will now be struck by Zeus.");
            	Bukkit.getServer().broadcastMessage(messageOnSwear);
            	player.getWorld().strikeLightningEffect(player.getLocation());
                break; // No need to continue checking
            }
        }
    }
}
