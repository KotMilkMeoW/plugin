package meowland;

import org.bukkit.plugin.java.JavaPlugin;

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
