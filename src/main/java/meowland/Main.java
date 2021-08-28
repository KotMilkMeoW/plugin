package meowland;

import org.bukkit.plugin.java.JavaPlugin;
import  org.bukkit.entity.Player;
import  org.bukkit.event.Event;
import  org.bukkit.event.player.PlayerListener;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        this.getLogger().info("ПЛУГИН ЗАПУСТИЛСЯ!!! (УДИВИТЕЛЬНО)");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    if(cmd.getName().equalsIgnoreCase("Hi!")){
         player.sendMessage("Hello!");
    }
    }
}
