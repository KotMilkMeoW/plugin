package stellar;

import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;

@SuppressWarnings("unused")
public class Handler implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent event) {

    }

    @EventHandler
    void onPlayerQuit(PlayerQuitEvent event) {

    }

    /* you can create custom events
    void eventName(EventType event) {
        // code
     }
     eventName can be whatever you want
     EventType is the type of event you want to handle*/

}
