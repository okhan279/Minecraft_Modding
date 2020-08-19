//To add another item:
	//Duplicate line 22, and change 'example_item' to new item name.
	//Duplicate like 27, and change 'example_item' in '.setRegistryName()' to the new item name.
	//Create new file in 'assets.tutorialmod.models.item' and change the name of 'example_item' to new item.
	//Copy the code within the 'en_us.json' file and change the 'example_item' to new item name. 

package com.tutorial.tutorialmod.init;

import com.tutorial.tutorialmod.TutorialMod;
import com.tutorial.tutorialmod.TutorialMod.TutorialItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(TutorialMod.MOD_ID)

public class ItemInit {
	
	public static final Item example_item = null; //Duplicate this code with different item name to add another item.
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("example_item"));
		
		event.getRegistry().registerAll(new Item(new Item.Properties().group(TutorialItemGroup.instance)
										.food(new Food.Builder().hunger(6).saturation(1.2f)
										.effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.5f).build()))
										.setRegistryName("example_item"));

	}
}
