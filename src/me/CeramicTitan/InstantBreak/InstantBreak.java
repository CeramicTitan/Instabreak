package me.ceramictitan.Insta;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Break extends JavaPlugin implements Listener {

	public void onDisable() {

	}

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onBlockDamage(BlockDamageEvent event) {
		if (event.getPlayer().hasPermission("insta.break")) {
			event.setInstaBreak(true);
		}
	}

}
