/*Steps to create a block:
	1. Create a block source code called 'blockInit'.
	2. In 'assets.tutorialmod.blockstates' create an 'example_block.json' file with the follokwing:
	3. In en_us.json (assets.tutorialmod.lang) add text to name the block.
	4. in 'assets.tutorialmod.item' create file called 'example_block.json'.
	5. Add item texture in 'assets.tutorialmod.textures.blocks'
*/

package com.tutorial.tutorialmod.init;

import com.tutorial.tutorialmod.TutorialMod;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@ObjectHolder(TutorialMod.MOD_ID)
@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.MOD)

public class blockInit {
	
	public static final Block example_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		
		event.getRegistry().register(new Block(Block.Properties.create(Material.ANVIL).hardnessAndResistance(0.7f, 15f)
									 .sound(SoundType.METAL)).setRegistryName("example_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new BlockItem(example_block, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_block"));
	}
}
