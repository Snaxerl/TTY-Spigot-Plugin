package snaxerl.tty;

import org.bukkit.plugin.java.JavaPlugin;
import snaxerl.tty.commands.Befehle;
import snaxerl.tty.commands.TTY1;


public final class TTY extends JavaPlugin {

    @Override
    public void onEnable() {

    getLogger().info("TTY online");
    getCommand("TTY").setExecutor(new TTY1());
    getCommand("Befehle").setExecutor(new Befehle());

    }

    @Override
    public void onDisable() {
       getLogger().info("TTY offline");
    }
}
