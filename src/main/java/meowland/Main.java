package meowland;

import org.bukkit.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.Server;
import org.bukkit.command.Command;

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
         player = (Player) sender;
         player.sendMessage("Hello!");
         return true;
    }
    return false;
    }
}
