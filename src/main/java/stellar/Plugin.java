package stellar;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.block;

@SuppressWarnings("unused")
public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Handler(), this); // listen events
        // calls on server start (end of reload)
    }
    public class BlockDamageEvent(){
        Bukkit.broadcastMessage("Тест?");
    }

    @Override
    public void onDisable() {
        // calls on server stop (start of reload)
    }
}
