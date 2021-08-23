package stellar;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Handler(), this); // listen events
        // calls on server start (end of reload)
    }

    @Override
    public void onDisable() {
        // calls on server stop (start of reload)
    }
}
