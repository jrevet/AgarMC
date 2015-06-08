package net.lnfinity.AgarMC.events;

import net.lnfinity.AgarMC.AgarMC;
import net.lnfinity.AgarMC.game.CPlayer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListener implements Listener {

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		AgarMC.get().getGame().addPlayer(new CPlayer(e.getPlayer()));
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		AgarMC.get().getGame().removePlayer(e.getPlayer());
	}
	
}
