package com.doremi.forge.mods;

import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {
    static int count = 0;
    @SubscribeEvent
    public void sendMessage(BlockEvent.BreakEvent event) {
        TextComponentString text = new TextComponentString("You broke a block!");
        Style style = new Style();
        style.setColor(TextFormatting.GOLD);
        text.setStyle(style);
        event.getPlayer().sendMessage(text);
    }
}
