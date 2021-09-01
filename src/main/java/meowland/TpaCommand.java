package meowland;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import java.lang.Math;

public class TpaCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
         if(cmd.getName().equalsIgnoreCase("tpa")){
             double x = -3000 + Math.random()*3000;
             double z = -3000 + Math.random()*3000;
             double y = 70;
             Player player = (Player) sender;
             player.teleport(new Location(player.getWorld(), x, y, z));
             return true;
         }
         return false;
}

}
