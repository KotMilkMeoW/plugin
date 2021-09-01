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

public class CommandSword implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
         if(cmd.getName().equalsIgnoreCase("sword")){
             Player player = (Player) sender;
             ItemStack stack = new ItemStack(Material.DIAMOND_SWORD, 1);
             stack.addEnchantment(Enchantment.KNOCKBACK, 2);
             player.getInventory().addItem(stack);
             return true;
         }
         return false;
}

}
