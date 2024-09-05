package org.peakimo.factionchat.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class Chat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("f")) {

            Player bazikon = (Player) sender;
            String playername = bazikon.getName();


            // Chat Taxi
            if (sender.hasPermission("FactionChat.one")) {
                if (args.length > 0) {
                    StringBuilder message = new StringBuilder();
                    for (String arg : args) {
                        message.append(arg).append(" ");
                    }
                    String finalMessage = message.toString().trim();

                    //Ersal message to PlayerHaye Faction
                    for (Player onlineplayers : Bukkit.getOnlinePlayers()){

                        if (onlineplayers.hasPermission("FactionChat.one")) {
                            onlineplayers.sendMessage(color(" &bFaction >&a " + playername + "&a: &f" + finalMessage));
                        }
                    }
                } else {

                    sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "لطفا یک پیام وارد کنید");
                }
            }

            // Chat Police
            if (sender.hasPermission("FactionChat.two")) {
                if (args.length > 0) {
                    StringBuilder message = new StringBuilder();
                    for (String arg : args) {
                        message.append(arg).append(" ");
                    }
                    String finalMessage = message.toString().trim();

                    //Ersal message to PlayerHaye Faction
                    for (Player onlineplayers : Bukkit.getOnlinePlayers()){

                        if (onlineplayers.hasPermission("FactionChat.two")) {
                            onlineplayers.sendMessage(color(" &bFaction >&a " + playername + "&a: &f" + finalMessage));
                        }
                    }
                } else {

                    sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "لطفا یک پیام وارد کنید");
                }
            }

            // Chat Medic
            if (sender.hasPermission("FactionChat.three")) {
                if (args.length > 0) {
                    StringBuilder message = new StringBuilder();
                    for (String arg : args) {
                        message.append(arg).append(" ");
                    }
                    String finalMessage = message.toString().trim();

                    //Ersal message to PlayerHaye Faction
                    for (Player onlineplayers : Bukkit.getOnlinePlayers()){

                        if (onlineplayers.hasPermission("FactionChat.three")) {
                            onlineplayers.sendMessage(color(" &bFaction >&a " + playername + "&a: &f" + finalMessage));
                        }
                    }
                } else {

                    sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "لطفا یک پیام وارد کنید");
                }
            }
        }
        return true;
    }
    private String color(String str) {


        //CodeColor
        return ChatColor.translateAlternateColorCodes('&', str);
        //CodeColor
    }
}
