package br.com.battlehost.pluginblocker;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	  public static Main instance;	
	  public static Plugin plugin;
		
	  public Main() {
		  instance = this;  
	  }
	  

	
	public static Main getInstance() {
		return instance;	
	}
	public static Plugin getPlugin() {
		return plugin;
	}
	
	public void onEnable() {
		Data();
}
	
	public void onDisable() {
		quitmessage();
	}

	
	public void Data() {
		eventos();
		joinmessage();
				
		plugin = this;
		instance = this;
		saveDefaultConfig();
		
	}
	
	public void eventos() {
		getServer().getPluginManager().registerEvents(new Verificar(), this);
	}
	
	public void joinmessage() {
		Bukkit.getConsoleSender().sendMessage("§a§l(BH_PluginBlocker) §7§oPlugin habilitado!");
		Bukkit.getConsoleSender().sendMessage("§a§l(BH_PluginBlocker) §7§oFeito por LuccasZambiasi.");
	}
	
	public void quitmessage() {
		Bukkit.getConsoleSender().sendMessage("§a§l(BH_PluginBlocker) §7§oPlugin desabilitado!");
		Bukkit.getConsoleSender().sendMessage("§a§l(BH_PluginBlocker) §7§oFeito por LuccasZambiasi.");
	}

}
