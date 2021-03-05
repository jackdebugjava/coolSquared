package io.github.jackdebugjava;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;

public class listener implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event) {
    	Player p =  event.getPlayer();
    	p.sendMessage(ChatColor.AQUA + "Welcome to bthlSMP, " + p + "! :)"); //message to players when they join
    }
}