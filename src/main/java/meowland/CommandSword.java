pacage meowland;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;

public class CommandSword implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    if(cmd.getName().equalsIgnoreCase("sword")){
         sender.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1).addEnchantment(Enchantment.ARROW_DAMAGE, 10));
         return true;
    }
    return false;
    }
    }
}