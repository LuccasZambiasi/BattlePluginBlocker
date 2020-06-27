package br.com.battlehost.pluginblocker;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Verificar implements Listener{
	
	@EventHandler(priority=EventPriority.HIGHEST)
	public void onCommandPreProcess(PlayerCommandPreprocessEvent e) {
		  String[] msg = e.getMessage().split(" ");
		  for (String Loop : Main.plugin.getConfig().getStringList("comandos.bloqueados")) {
		    if (msg[0].equalsIgnoreCase("/" + Loop)) {
		    	if (!e.getPlayer().hasPermission("battlehost.pluginblocker")) {
			        e.getPlayer().sendMessage(Main.plugin.getConfig().getString("mensagens.bloqueado").replace("&", "§"));
			        e.setCancelled(true);
		    	} else {
		    		e.setCancelled(false);
		    	}
		    }
		   }
		  
	}
}